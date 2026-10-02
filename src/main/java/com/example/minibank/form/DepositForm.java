package com.example.minibank.form;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

//バリデーションを入れる
@Data
@NoArgsConstructor
public class DepositForm {

	private BigDecimal amount;
	
}
