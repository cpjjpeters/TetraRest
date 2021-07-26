package com.example.tetra.TetraRestDemo.exception;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ExceptionAndErrorHandler {

//	@ExceptionHandler(HttpMessageNotReadableException.class)
//	public ResponseEntity handleBadInput(HttpMessageNotReadableException ex) {
//		Throwable cause = ex.getCause();
//
//	}
	
//    @ExceptionHandler(ConstraintViolationException.class)
//    public HttpEntity<List<ErrorResource>> handleConstraintViolationException(ConstraintViolationException exception) {
//        final List<ErrorResource> errorResources = exception.getConstraintViolations().stream()
//            .peek(constraintViolation -> logger.debug("Constraint violation has occurred: {} {}",
//                constraintViolation.getMessage(), constraintViolation.getPropertyPath()))
//            .map(violation -> new ErrorResource(HttpStatus.BAD_REQUEST, exception, violation.getMessage(), violation.getPropertyPath().toString()))
//            .collect(Collectors.toList());
//        return new ResponseEntity<>(errorResources, HttpStatus.BAD_REQUEST);
//    }
    
	@ExceptionHandler(RecordNotFoundException.class)
	public HttpEntity<ErrorResource> handleRecordNotFoundException(RecordNotFoundException exception) {
        return handleException(HttpStatus.NOT_FOUND, exception, exception.getMessage());
    }
	
    @ExceptionHandler(Exception.class)
    public HttpEntity<ErrorResource> handleAnyOtherException(Exception exception) {
        return handleException(HttpStatus.INTERNAL_SERVER_ERROR, exception, exception.getMessage());
    }

    private HttpEntity<ErrorResource> handleException(HttpStatus status, Throwable exception){
    	return handleException(status, exception, null);
    }
    
    private HttpEntity<ErrorResource> handleException(HttpStatus status, Throwable exception, String message){
    	return handleException(status, exception, message, null);
    }
    
    private HttpEntity<ErrorResource> handleException(HttpStatus status, Throwable exception, String message, String code){
//    	this.log.error("An exception was encountered: {}", ExceptionUtils.getStackTrace(exception));
    	final ErrorResource errorResource = new ErrorResource(status, exception, message, code);
    	return ResponseEntity.status(status)
    			.contentType(MediaType.APPLICATION_JSON)
    			.body(errorResource);
    }
}
