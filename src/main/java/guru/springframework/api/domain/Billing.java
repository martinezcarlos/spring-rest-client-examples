package guru.springframework.api.domain;

import java.io.Serializable;
import lombok.Data;

@Data
class Billing implements Serializable {

  private final static long serialVersionUID = -6535166286416076775L;
  private Card card;
}
