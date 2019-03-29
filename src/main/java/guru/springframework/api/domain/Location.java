package guru.springframework.api.domain;

import java.io.Serializable;
import lombok.Data;

@Data
class Location implements Serializable {

  private final static long serialVersionUID = 9063524910523451877L;
  private String street;
  private String city;
  private String state;
  private String postcode;
}
