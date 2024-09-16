package springkis.backend.common.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = {
	KisProperties.class,
})
public class PropertiesConfig {
}

