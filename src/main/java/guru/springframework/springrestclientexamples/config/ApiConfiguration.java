package guru.springframework.springrestclientexamples.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by carlosmartinez on 2019-04-05 19:59
 */
@Getter
@Setter
//@EnableConfigurationProperties
@ConfigurationProperties(prefix = "api")
@Component
public class ApiConfiguration {

  private String url;
}
