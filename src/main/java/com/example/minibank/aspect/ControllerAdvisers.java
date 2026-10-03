package com.example.minibank.aspect;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.minibank.exception.AccountNotFoundException;
import com.example.minibank.exception.IllegalAmountException;
import com.example.minibank.exception.InsufficientBalanceException;

@ControllerAdvice
public class ControllerAdvisers {

	@ExceptionHandler({ AccountNotFoundException.class })
	public String accountNotFoundError(AccountNotFoundException e, RedirectAttributes attribute) {

		attribute.addFlashAttribute("errorMsg", e.getMessage());

		return "redirect:/login";

	}

	@ExceptionHandler({ IllegalAmountException.class })
	public String illegalAmountError(IllegalAmountException e, Model model) {

		model.addAttribute("errorMsg", e.getMessage());
		return "deposit";

	}

	@ExceptionHandler({ InsufficientBalanceException.class })
	public String InsufficientBalanceError(InsufficientBalanceException e, RedirectAttributes attributes) {

		attributes.addFlashAttribute("errorMsg", e.getMessage());
		return "redirect:/withdrawal";

	}

}
