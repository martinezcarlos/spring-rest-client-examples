package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by carlosmartinez on 2019-03-29 14:45
 */
@RequiredArgsConstructor
@Service
public class ApiServiceImpl implements ApiService {

  private final RestTemplate restTemplate;

  @Override
  public List<User> getUsers(final Integer limit) {
    final UserData userData = restTemplate.getForObject(
        "http://apifaketory.com/api/user?limit=" + limit, UserData.class);
    return Optional.ofNullable(userData).isPresent() ? userData.getData() : Collections.emptyList();
  }
}
