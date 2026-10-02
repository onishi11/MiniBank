package com.example.minibank.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.minibank.form.WithdrawalForm;

@Controller
@RequestMapping("/withdrawal")
public class WithdrawalController {

	@GetMapping
	public String login(@ModelAttribute WithdrawalForm withdrawalForm) {
		
		
		return "withdrawal";
		
	}
	
}
