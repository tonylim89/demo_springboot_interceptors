package sg.edu.nus.iss.demo_springboot_interceptors.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
  @GetMapping("/list")
  public String list() {
    // Todo: only allow logged-in users to access this page
    return "product-list";
  }
  
  @GetMapping("/create")
  public String create(HttpSession session) {
    // Todo: only allow logged-in users to access this page
    return "product-create";
  }
}
