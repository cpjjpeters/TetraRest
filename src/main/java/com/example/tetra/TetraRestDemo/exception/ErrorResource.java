package com.example.tetra.TetraRestDemo.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author Carl Peters (should go in api.yml
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResource {

   private String type;
   
    private String title;
   
    private HttpStatus status;

    private String message;

    private String code;

    private String exceptionType;
   
//    private ErrorKeyResource[] errors;

    public ErrorResource(HttpStatus status, String message) {
        this(status, message, null);
    }

    public ErrorResource(HttpStatus status, String message, String code) {
        this.status = status;
        this.message = message;
        this.code = code;
        if (code == null && status != null) {
            this.code = status.toString();
        }
    }

    public ErrorResource(HttpStatus status, Throwable exception,  String code) {
		this(status,exception.getMessage(), code);
		this.exceptionType = exception.getClass().getTypeName();
	}
    
	public ErrorResource(HttpStatus status, Throwable exception, String message, String code) {
		this(status,exception, code);
		if(message != null) {
			this.message = message;
		}
	}


}
