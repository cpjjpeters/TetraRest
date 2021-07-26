package com.example.tetra.TetraRestDemo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HandledException extends Exception{
	private String code;
	

	public HandledException(String code, String message) {
		super(message);
		this.setCode(code);
	}
	
	public HandledException(String code, String message, Throwable cause) {
		super(message, cause);
		this.setCode(code);
	}
}
