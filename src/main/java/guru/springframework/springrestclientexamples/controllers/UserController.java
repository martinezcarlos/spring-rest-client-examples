package guru.springframework.springrestclientexamples.controllers;

import guru.springframework.springrestclientexamples.services.ApiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;

/**
 * Created by carlosmartinez on 2019-04-02 15:33
 */
//@Log4j2
@Slf4j
@RequiredArgsConstructor
@Controller
public class UserController {

  private final ApiService apiService;

  @GetMapping({"", "/", "/index"})
  public String index() {
    return "index";
  }

  @PostMapping("/users")
  public String formPost(final Model model, final ServerWebExchange serverWebExchange) {
    log.debug("Executing form post");

    serverWebExchange.getFormData().subscribe(map -> {
      Integer limit = Integer.valueOf(map.getFirst("limit"));
      log.debug("Received limit: [" + limit + "]");
      if (limit == null || limit == 0) {
        log.debug("Setting default limit to 10");
        limit = 10;
      }
      model.addAttribute("users", apiService.getUsers(limit));
    });
    return "userlist";
  }
}
