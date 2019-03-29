package guru.springframework.api.domain;

import java.io.Serializable;
import lombok.Data;

@Data
class Login implements Serializable {

  private final static long serialVersionUID = 1753260830066259574L;
  private String username;
  private String password;
  private String md5;
  private String sha1;
  private String sha256;
}
