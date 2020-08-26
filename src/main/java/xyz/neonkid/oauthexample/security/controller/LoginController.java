package xyz.neonkid.oauthexample.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import xyz.neonkid.oauthexample.annotation.SocialUser;
import xyz.neonkid.oauthexample.model.User;

/**
 * Created by Neon K.I.D on 8/9/20
 * Blog : https://blog.neonkid.xyz
 * Github : https://github.com/NEONKID
 */
@Controller
public class LoginController {
    @GetMapping({"", "/"})
    public String getAuthorizationMessage() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/board")
    public String board() {
        return "board";
    }

    @GetMapping("/loginSuccess")
    public String loginComplete(@SocialUser User user) {
        return "redirect:/board";
    }
}
