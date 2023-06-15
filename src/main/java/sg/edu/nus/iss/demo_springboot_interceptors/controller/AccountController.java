package sg.edu.nus.iss.demo_springboot_interceptors.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
  @GetMapping("/edit") 
  public String edit() {
    // Todo: only allow logged-in users to access this page
    return "account-edit";
  }
  
  @GetMapping("/delete") 
  public String delete() {
    // Todo: only allow logged-in users to access this page
    return "account-delete";
  }
}
