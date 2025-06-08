package springkis.backend.api.oauth.issueAccessToken;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import springkis.backend.api.oauth.issueAccessToken.dto.request.IssueAccessTokenRequest;
import springkis.backend.kisLibrary.oauth.dto.response.IssueAccessTokenResponse;

@RestController
@RequestMapping("/api/oauth/issue-access-token")
@RequiredArgsConstructor
public class IssueAccessTokenController {
	private final IssueAccessTokenService issueAccessTokenService;

	@PostMapping
	public IssueAccessTokenResponse issueAccessToken(@RequestBody IssueAccessTokenRequest request) {
		return issueAccessTokenService.issueAccessToken(request);
	}
}
