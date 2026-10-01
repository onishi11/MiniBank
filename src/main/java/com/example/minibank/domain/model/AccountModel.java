package com.example.minibank.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserModel userId;
	private int balance;
	private int accountNumber;

	
}