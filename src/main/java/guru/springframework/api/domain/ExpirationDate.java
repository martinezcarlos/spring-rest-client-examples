package guru.springframework.api.domain;

import java.io.Serializable;
import lombok.Data;

@Data
class ExpirationDate implements Serializable {

  private final static long serialVersionUID = 8770956397318237432L;
  private String date;
  private Integer timezoneType;
  private String timezone;
}
