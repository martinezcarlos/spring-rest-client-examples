package guru.springframework.api.domain;

import java.io.Serializable;
import lombok.Data;

@Data
class Card implements Serializable {

  private final static long serialVersionUID = 6274760933802211028L;
  private String type;
  private String number;
  private ExpirationDate expirationDate;
  private String iban;
  private String swift;
}
