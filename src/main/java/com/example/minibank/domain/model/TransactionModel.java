package com.example.minibank.domain.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name="transaction")
public class TransactionModel {
/* | id          |
| account_id  |
| type        |
| amount      |
| description |
| created_at  */
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	@JoinColumn(name="account_id")
	private AccountModel accountId;
	@Enumerated(EnumType.STRING)
	private TransactionType type;
	private String amount;
	private String description;
	private LocalDateTime createdAt;

	
}
