package springkis.backend.common.webClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;

import io.netty.channel.ChannelOption;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.netty.http.client.HttpClient;
import springkis.backend.common.properties.KisProperties;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class WebClientConfig {

	private final KisProperties kisProperties;

	private HttpClient httpClient = HttpClient.create()
		.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 5000); // 5초

	@Bean
	public WebClient kisWebClient() {
		return WebClient.builder()
			.baseUrl(kisProperties.getDomain())
			.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE)
			.codecs(configurer -> configurer.defaultCodecs()
				.maxInMemorySize(2 * 1024 * 1024)) // 응답 payload가 클 경우 나는 에러 방지, 최대 2MB
			.clientConnector(new ReactorClientHttpConnector(httpClient))
			.build();
	}
}