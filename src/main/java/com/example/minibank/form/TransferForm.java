package com.example.minibank.form;

import lombok.Data;
import lombok.NoArgsConstructor;

//バリデーションを入れる
@Data
@NoArgsConstructor
public class TransferForm {

	private String username;
	private String password;
	
}
