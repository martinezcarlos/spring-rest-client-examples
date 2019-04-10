package guru.springframework.springrestclientexamples.services;

import guru.springframework.springrestclientexamples.config.ApiConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by carlosmartinez on 2019-04-05 20:17
 */
@RequiredArgsConstructor
@Service
public class ApiConfigurationServiceImpl implements ApiConfigurationService {

  private final ApiConfiguration apiConfiguration;

  @Override
  public String getUrl() {
    return apiConfiguration.getUrl();
  }
}
