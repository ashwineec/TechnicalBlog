package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @RequestMapping("users/login")
    public String login() {
        return "users/login";
    }

    @RequestMapping("/registration")
    public String registration() {
        return "registration";
    }
    
    @RequestMapping(value="users/login", method=RequestMethod.POST)
    public String loginUser() {
        return "redirect:/posts";
    }
}
