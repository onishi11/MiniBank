package com.example.minibank.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.minibank.form.LoginForm;

@Controller
@RequestMapping("/login")
public class LoginController {

	@GetMapping
	public String showLogin(@ModelAttribute LoginForm loginForm) {
		
		
		return "login";
		
	}
	
	@PostMapping
	public String login() {
		
		return "redirect : /dashboard";
		
	}
	
	
}
