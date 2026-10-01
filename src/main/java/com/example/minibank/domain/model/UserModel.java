package com.example.minibank.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="users")
@NoArgsConstructor
public class UserModel {
/*| id                  |
| username            |
| password            |
| role                |
| created_at          |
| updated_at          |
| USER                |
| CURRENT_CONNECTIONS |
| TOTAL_CONNECTIONS   |
| id                  |
| name                |
| password */
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String password;

	
}
