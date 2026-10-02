package com.example.minibank.domain.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.minibank.domain.model.AccountModel;
import com.example.minibank.domain.repository.AccountRepository;
import com.example.minibank.domain.service.AccountService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService{
	
	private final AccountRepository accountRepository;

	@Override
	public List<AccountModel> getAll() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public AccountModel getAccountByUserId(int userId) {
		// TODO 自動生成されたメソッド・スタブ
		AccountModel account = accountRepository.getAccountByUserId(userId);
		return account;
	}

	@Override
	public BigDecimal getBalanceByUserId(int userId) {
		// TODO 自動生成されたメソッド・スタブ
		AccountModel account = accountRepository.getAccountByUserId(userId);
		return account.getBalance();
		
	}

	
	


	
}
