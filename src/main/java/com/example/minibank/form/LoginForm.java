package com.example.minibank.form;

import lombok.Data;
import lombok.NoArgsConstructor;

//バリデーションを入れる
@Data
@NoArgsConstructor
public class LoginForm {

	private String username;
	private String password;
	
}
