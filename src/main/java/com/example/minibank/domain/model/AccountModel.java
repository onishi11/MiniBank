package com.example.minibank.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="accounts")
@NoArgsConstructor
public class AccountModel {

	@Id
	@GeneratedValue
	private int id;
	@Column(name="user_id")
	private int userId;
	private BigDecimal balance;
	private int accountNumber;

	
}