package com.example.minibank.domain.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.minibank.domain.model.AccountModel;

public interface AccountService {

	public List<AccountModel> getAll();
	
	public AccountModel getAccountByUserId(int userId);
	
	public BigDecimal getBalanceByUserId(int userId);
	
}
