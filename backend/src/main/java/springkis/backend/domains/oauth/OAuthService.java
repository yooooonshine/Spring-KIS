package springkis.backend.domains.oauth;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import springkis.backend.common.webClient.WebClientUtil;
import springkis.backend.domains.oauth.dto.request.IssueAccessTokenRequest;
import springkis.backend.domains.oauth.dto.request.IssueRealTimeWebSocketAccessTokenRequest;
import springkis.backend.domains.oauth.dto.request.RevokeAccessTokenRequest;
import springkis.backend.domains.oauth.dto.response.IssueAccessTokenResponse;
import springkis.backend.domains.oauth.dto.response.IssueRealTimeWebSocketAccessTokenResponse;
import springkis.backend.domains.oauth.dto.response.RevokeAccessTokenResponse;

@Service
@RequiredArgsConstructor
public class OAuthService {

	private final WebClientUtil webClientUtil;

	public IssueRealTimeWebSocketAccessTokenResponse issueRealTimeWebSocketAccessToken(
		final IssueRealTimeWebSocketAccessTokenRequest request) {
		final String url = "/oauth2/Approval";

		return webClientUtil.postFromKis(
			new HashMap<>(),
			url,
			request,
			IssueRealTimeWebSocketAccessTokenResponse.class
		);
	}

	public IssueAccessTokenResponse issueAccessToken(final IssueAccessTokenRequest request) {
		final String url = "/oauth2/tokenP";

		return webClientUtil.postFromKis(
			new HashMap<>(),
			url,
			request,
			IssueAccessTokenResponse.class
		);
	}

	public RevokeAccessTokenResponse revokeAccessToken(RevokeAccessTokenRequest request) {
		final String url = "/oauth2/revokeP";

		return webClientUtil.postFromKis(
			new HashMap<>(),
			url,
			request,
			RevokeAccessTokenResponse.class
		);
	}
}
