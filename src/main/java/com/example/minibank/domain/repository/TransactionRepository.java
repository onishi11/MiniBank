package com.example.minibank.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.minibank.domain.model.TransactionModel;

public interface TransactionRepository extends JpaRepository<TransactionModel, Integer>{

}
