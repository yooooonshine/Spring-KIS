package springkis.backend.domains.oauth.dto.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IssueAccessTokenResponse {
	private String access_token;
	private String token_type;
	private Integer expires_in;
	private String access_token_token_expired;
}
