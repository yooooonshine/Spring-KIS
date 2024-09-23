package springkis.backend.common.dto;

import static lombok.AccessLevel.*;

import java.util.HashMap;
import java.util.Map;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = PRIVATE)
public class Header {
	@NotBlank
	private String authorization;

	@NotBlank
	private String appkey;

	@NotBlank
	private String appsecret;

	@NotBlank
	private String tr_id;

	public Map<String, String> toMap() {
		Map<String, String> headers = new HashMap<>();
		headers.put("authorization", authorization);
		headers.put("appkey", appkey);
		headers.put("appsecret", appsecret);
		headers.put("tr_id", tr_id);

		return headers;
	}
}
