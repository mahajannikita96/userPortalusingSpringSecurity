package com.example.UserMaster.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.UserMaster.Entity.UserMaster;
import com.example.UserMaster.Service.UserService;



@Controller
@RequestMapping("/registration")
public class UserController {
	
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	
	@GetMapping("/register")
	public String showRegistrationForm() {
		return "Register_LoginPage";
	}
	

	@GetMapping("/login")
	public String showLoginPage() {
		return "Register_LoginPage";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user")  UserMaster userdto){
		userService.save(userdto);
		return "redirect:/register?success";
	}
	
	
	
	

}
