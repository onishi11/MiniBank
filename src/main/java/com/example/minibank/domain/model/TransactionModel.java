package com.example.minibank.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Data
@Table(name="transaction")
@AllArgsConstructor
public class TransactionModel {

	public TransactionModel(int accountId, TransactionType type, BigDecimal amount, String description, LocalDateTime createdAt) {
		
		this.accountId = accountId;
		this.type = type;
		this.amount = amount;
		this.description = description;
		this.createdAt = createdAt;
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int accountId;
	@Enumerated(EnumType.STRING)
	private TransactionType type;
	private BigDecimal amount;
	private String description;
	private LocalDateTime createdAt;

	
}
