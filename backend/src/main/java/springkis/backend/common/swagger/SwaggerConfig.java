package springkis.backend.common.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
	@Bean
	public OpenAPI openAPI() {

		return new OpenAPI()
			.info(apiInfo());
	}

	private Info apiInfo() {
		return new Info()
			.title("Spring 한국투자증권 api 명세서")
			.description("Spring 한국투자증권 api 명세서입니다.")
			.version("1.0.0");
	}
}