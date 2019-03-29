package guru.springframework.api.domain;

import java.io.Serializable;
import lombok.Data;

@Data
class Job implements Serializable {

  private final static long serialVersionUID = 3277550551976966506L;
  private String title;
  private String company;
}
