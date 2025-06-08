package springkis.backend.kisLibrary;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import springkis.backend.kisLibrary.oauth.service.OauthAuthentication;

@Component
@RequiredArgsConstructor
public class KisApi {

	public final OauthAuthentication oauthAuthentication;
}
