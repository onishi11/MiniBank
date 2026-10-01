package com.example.minibank.app;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.minibank.domain.service.UserService;
import com.example.minibank.form.LoginForm;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/dashboard")

public class DashboardController {

	private final UserService userService;

	@GetMapping
	public String login(@ModelAttribute LoginForm loginForm, Model model,
			@AuthenticationPrincipal UserDetails userDetails) {

		model.addAttribute("userList", userService.getAll());
		model.addAttribute("username", userDetails.getUsername());
		return "dashboard";

	}

}
