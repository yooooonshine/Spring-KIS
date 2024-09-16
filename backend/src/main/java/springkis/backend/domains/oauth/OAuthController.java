package springkis.backend.domains.oauth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import springkis.backend.domains.oauth.dto.request.IssueAccessTokenRequest;
import springkis.backend.domains.oauth.dto.request.IssueRealTimeWebSocketAccessTokenRequest;
import springkis.backend.domains.oauth.dto.response.IssueAccessTokenResponse;
import springkis.backend.domains.oauth.dto.response.IssueRealTimeWebSocketAccessTokenResponse;

@RestController
@RequestMapping("/oauth")
@RequiredArgsConstructor
public class OAuthController {

	private final OAuthService oAuthService;

	@PostMapping("/real-time-websocket-access-token")
	public ResponseEntity<IssueRealTimeWebSocketAccessTokenResponse> issueRealTimeWebSocketAccessToken(final @RequestBody @Valid IssueRealTimeWebSocketAccessTokenRequest request) {
		final IssueRealTimeWebSocketAccessTokenResponse response = oAuthService.issueRealTimeWebSocketAccessToken(request);

		return ResponseEntity.ok(response);
	}

	@PostMapping("/access-token")
	public ResponseEntity<IssueAccessTokenResponse> issueAccessToken(final @RequestBody @Valid IssueAccessTokenRequest request) {
		final IssueAccessTokenResponse response = oAuthService.issueAccessToken(request);

		return ResponseEntity.ok(response);
	}
}
