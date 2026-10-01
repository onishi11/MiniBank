package com.example.minibank.domain.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Data;

@Data
public class LoginUser extends User{
	
	public LoginUser(int id, String username, String password, Collection<? extends GrantedAuthority> authorities) {
		
		super(username, password, authorities);
			
		this.id = id;
		this.username = username;
		
	}

	private final int id;
	private final String username;
	private final String password;
	
}
