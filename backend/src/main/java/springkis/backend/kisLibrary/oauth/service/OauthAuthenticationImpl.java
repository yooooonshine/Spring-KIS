package springkis.backend.kisLibrary.oauth.service;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.RequiredArgsConstructor;
import springkis.backend.kisLibrary.oauth.service.issueAccessToken.builder.IssueAccessTokenRequestBuilder;

// 접속토큰발급
// 접속토큰폐기
// HashKey
// 실시간 (웹소켓) 접속키 발급
@Component
@RequiredArgsConstructor
public class OauthAuthenticationImpl implements OauthAuthentication {

	private final WebClient webClient;

	// 접근토큰발급 Builder 생성
	public IssueAccessTokenRequestBuilder issueAccessToken() {
		return new IssueAccessTokenRequestBuilder(webClient);
	}
}
