package springkis.backend.kisLibrary.oauth.service.issueAccessToken.builder;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;
import springkis.backend.kisLibrary.exception.KisException;
import springkis.backend.kisLibrary.oauth.dto.response.IssueAccessTokenResponse;

public class IssueAccessTokenRequestBuilder {

	private final Map<String, String> bodyMap = new HashMap<>();
	private final WebClient webClient;

	public IssueAccessTokenRequestBuilder(WebClient webClient) {
		this.webClient = webClient;
	}

	// Body 빌더 생성
	public TokenBodyBuilder body() {
		return new TokenBodyBuilder(this);
	}

	// KIS에 접속토큰 발급 요청
	public Mono<IssueAccessTokenResponse> send() {
		Map<String, String> body = bodyMap.entrySet().stream()
			.filter(entry -> entry.getValue() != null)
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		return webClient.post()
			.uri("/oauth2/tokenP")
			.body(BodyInserters.fromValue(body))
			.retrieve()
			.onStatus(
				status -> status.is4xxClientError() || status.is5xxServerError(),
				response -> response.bodyToMono(Object.class)
					.flatMap(error -> Mono.error(KisException.from((HttpStatus)response.statusCode(), error)))
			)
			.bodyToMono(IssueAccessTokenResponse.class);
	}

	// Body 빌더
	public static class TokenBodyBuilder {
		private final IssueAccessTokenRequestBuilder parent;

		public TokenBodyBuilder(IssueAccessTokenRequestBuilder parent) {
			this.parent = parent;
		}

		//권한부여 Type
		public TokenBodyBuilder grantType(String value) {
			parent.bodyMap.put("grant_type", value);
			return this;
		}

		// 앱키
		public TokenBodyBuilder appKey(String value) {
			parent.bodyMap.put("appkey", value);
			return this;
		}

		// 앱시키
		public TokenBodyBuilder appSecret(String value) {
			parent.bodyMap.put("appsecret", value);
			return this;
		}

		// 빌더 설정 완료시 호출
		public IssueAccessTokenRequestBuilder done() {
			return parent;
		}
	}
}
