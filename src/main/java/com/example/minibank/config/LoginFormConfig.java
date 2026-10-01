package com.example.minibank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class LoginFormConfig {

	//自作ログイン画面に対して遷移する設定
	@Bean
	 SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http
			.formLogin(login -> login
					.loginPage("/login")
					.defaultSuccessUrl("/dashboard", true)
					.permitAll()
					)
			.authorizeHttpRequests(authz -> authz
					.anyRequest().authenticated()
					);
		
		return http.build();

	}
	
}
