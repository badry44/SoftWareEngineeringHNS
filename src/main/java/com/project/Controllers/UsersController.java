package com.project.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsersController {

   @RequestMapping("/")
   public String index() {
      return "index";
   }
@PostMapping("/Login")
public String Login()
{
	return "Login";
}
@PostMapping("/Register")
public String Register()
{
	
	return "Register";
}
   @PostMapping("/hello")
   public String sayHello(@RequestParam("name") String name, Model model) {
      model.addAttribute("name", name);
      return "hello";
   }
}