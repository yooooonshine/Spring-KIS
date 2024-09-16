package springkis.backend.domains.oauth.dto.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IssueRealTimeWebSocketAccessTokenResponse {
	private String approval_key;
}
