package springkis.backend.kisLibrary.oauth.service;

import springkis.backend.kisLibrary.oauth.service.issueAccessToken.builder.IssueAccessTokenRequestBuilder;

// 접속토큰발급
// 접속토큰폐기
// HashKey
// 실시간 (웹소켓) 접속키 발급
public interface OauthAuthentication {

	// 접속토큰발급
	IssueAccessTokenRequestBuilder issueAccessToken();
}
