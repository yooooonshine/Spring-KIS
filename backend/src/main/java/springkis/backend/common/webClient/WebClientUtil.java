package springkis.backend.common.webClient;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;
import springkis.backend.common.exception.KisException;

@Component
@RequiredArgsConstructor
public class WebClientUtil {

	private final WebClient kisWebClient;

	public <T> T getFromKis(
		final Map<String, String> headersMap,
		final String url,
		final MultiValueMap<String, String> params,
		final Class<T> responseType) {
		return kisWebClient
			.get()
			.uri(uriBuilder -> uriBuilder
				.path(url)
				.queryParams(params)
				.build())
			.headers(headers -> headersMap.forEach(headers::set))
			.retrieve()
			.onStatus(
				status -> status.is4xxClientError() || status.is5xxServerError(),
				response -> response.bodyToMono(Object.class)
					.flatMap(error -> Mono.error(KisException.from(
						(HttpStatus)response.statusCode(),
						error)))
			)
			.bodyToMono(responseType)
			.block();
	}

	public <T, V> T postFromKis(
		final Map<String, String> headersMap,
		final String url,
		final V request,
		final Class<T> responseType) {
		return kisWebClient
			.post()
			.uri(url)
			.headers(headers -> headersMap.forEach(headers::set))
			.bodyValue(request)
			.retrieve()
			.onStatus(
				status -> status.is4xxClientError() || status.is5xxServerError(),
				response -> response.bodyToMono(Object.class)
					.flatMap(error -> Mono.error(KisException.from(
						(HttpStatus)response.statusCode(),
						error)))
			)
			.bodyToMono(responseType)
			.block();
	}
}
