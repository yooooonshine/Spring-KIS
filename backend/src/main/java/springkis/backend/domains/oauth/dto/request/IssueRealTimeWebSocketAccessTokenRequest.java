package springkis.backend.domains.oauth.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IssueRealTimeWebSocketAccessTokenRequest {

	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private final String grant_type = "client_credentials";
	private String appkey;
	private String secretkey;
}
