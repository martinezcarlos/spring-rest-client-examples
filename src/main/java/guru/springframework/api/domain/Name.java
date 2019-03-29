package guru.springframework.api.domain;

import java.io.Serializable;
import lombok.Data;

@Data
class Name implements Serializable {

  private final static long serialVersionUID = 4462532471026311752L;
  private String title;
  private String first;
  private String last;
}
