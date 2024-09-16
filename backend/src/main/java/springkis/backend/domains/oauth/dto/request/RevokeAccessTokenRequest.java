package springkis.backend.domains.oauth.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RevokeAccessTokenRequest {
	private String appkey;
	private String appsecret;
	private String token;
}
