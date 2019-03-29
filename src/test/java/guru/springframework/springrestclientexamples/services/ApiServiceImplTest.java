package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by carlosmartinez on 2019-03-29 14:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

  @Autowired
  private ApiService apiService;

  @Before
  public void setUp() {
  }

  @Test
  public void getUsers() {
    final List<User> users = apiService.getUsers(3);
    assertEquals(4, users.size());
  }
}
