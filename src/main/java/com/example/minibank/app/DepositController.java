package com.example.minibank.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.minibank.domain.service.DepositService;
import com.example.minibank.form.DepositForm;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/deposit")
@RequiredArgsConstructor
public class DepositController {
	
	private final DepositService depositService; 

	@GetMapping
	public String showDeposit(@ModelAttribute DepositForm depositForm) {
		
		
		
		return "deposit";
		
	}
	@PostMapping
	public String doDeposit(@ModelAttribute DepositForm depositForm) {
		
		depositService.
		
		return "redirect:/dashboard";
		
	}
	
}
