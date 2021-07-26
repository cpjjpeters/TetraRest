package com.example.tetra.TetraRestDemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @author cpjjp
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such record")
public class RecordNotFoundException extends FunctionalException{
	
	public RecordNotFoundException(String message) {
		super(message);
	}

}
