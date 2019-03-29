package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import java.util.List;

/**
 * Created by carlosmartinez on 2019-03-29 14:44
 */
public interface ApiService {
  List<User> getUsers(Integer limit);
}
