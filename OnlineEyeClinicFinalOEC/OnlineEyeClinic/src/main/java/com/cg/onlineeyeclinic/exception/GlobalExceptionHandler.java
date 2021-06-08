package com.cg.onlineeyeclinic.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value= TestIdNotFoundException.class)
	public ResponseEntity<Object> handleTestIdNotFoundException(TestIdNotFoundException exception, WebRequest webRequest){
		ErrorDetails errorDetails = new ErrorDetails(404, exception.getMessage(), LocalDateTime.now());
		return new ResponseEntity<Object>(errorDetails, HttpStatus.NOT_FOUND);
	}
}