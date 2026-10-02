package com.example.minibank.authentication.entity;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomUserDetails implements UserDetails {

	private final String username;
	private final String password;
	private final Integer accountNumber;

	@Override
	public String getUsername() {
		
		return this.username;
		
	}
	
	@Override
	public String getPassword() {
		
		return this.password;
		
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソッド・スタブ
		return List.of();
	}
	
	
	
}
