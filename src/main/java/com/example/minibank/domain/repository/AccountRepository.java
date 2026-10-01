package com.example.minibank.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.minibank.domain.model.AccountModel;

public interface AccountRepository extends JpaRepository<AccountModel, Integer>{

}
