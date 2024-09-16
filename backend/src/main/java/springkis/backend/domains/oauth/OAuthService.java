package springkis.backend.domains.oauth;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import springkis.backend.common.webClient.WebClientUtil;
import springkis.backend.domains.oauth.dto.request.IssueRealTimeWebSocketAccessTokenRequest;
import springkis.backend.domains.oauth.dto.response.IssueRealTimeWebSocketAccessTokenResponse;

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
}
