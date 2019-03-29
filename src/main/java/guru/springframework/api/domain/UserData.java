package guru.springframework.api.domain;

import java.util.List;
import lombok.Data;

/**
 * Created by carlosmartinez on 2019-03-29 14:48
 */
@Data
public class UserData {
  private List<User> data;
}
