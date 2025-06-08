package springkis.backend.kisLibrary.oauth.dto.response;

// 접속토큰 발급 응답
public record IssueAccessTokenResponse(
	String access_token, // 접속 토큰
	String token_type, // 접속토큰 유형
	double expires_in, // 접속토큰 유효기간
	String access_token_token_expired // 접속토큰 유효기간(일시표시)
) {
}
