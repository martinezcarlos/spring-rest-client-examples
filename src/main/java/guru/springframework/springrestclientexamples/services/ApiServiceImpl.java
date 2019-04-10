package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by carlosmartinez on 2019-03-29 14:45
 */
@RequiredArgsConstructor
@Service
public class ApiServiceImpl implements ApiService {

  private final RestTemplate restTemplate;

  /*
   * @Value is considered bad practice (https://tuhrig.de/using-configurationproperties-to-separate-service-and-configuration).
   * There are 3 ways to work with this @Value:
   *
   * 1. To create a constructor manually:
   *
   * public ApiServiceImpl(@Value("${api.url}" String apiUrl){
   *   this.apiUrl = apiUrl;
   * }
   *
   * 2. To use lombok.@RequiredArgsConstructor but don't define apiUrl as final,so it won't be used
   * in the constructor but injected the @Value.
   *
   * 3. Using the "final" modifier (as a constant or single initialization should be) but declaring
   * a lombok.config file (since v1.18.4) and telling it to inject the @Value annotation to the
   * constructor so that it looks exactly as in literal 1.
   */
  //@Value("${api.url}")
  //private final String apiUrl;

  // This is the recommended way. Create a Service interface to handle the properties.
  private final ApiConfigurationService apiConfigurationService;

  @Override
  public List<User> getUsers(final Integer limit) {
    final UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(
        apiConfigurationService.getUrl()).queryParam("limit", limit);
    final UserData userData = restTemplate.getForObject(builder.toUriString(), UserData.class);
    return Optional.ofNullable(userData).isPresent() ? userData.getData() : Collections.emptyList();
  }
}
