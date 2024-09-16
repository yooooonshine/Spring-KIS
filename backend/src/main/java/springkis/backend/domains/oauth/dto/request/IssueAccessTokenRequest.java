package springkis.backend.domains.oauth.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IssueAccessTokenRequest {
	private String grant_type;
	private String appkey;
	private String secretkey;
}
