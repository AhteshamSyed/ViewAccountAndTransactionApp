package com.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
	@ExceptionHandler(AccountNotFoundException.class)
	public ResponseEntity<String>handleEmployeeNotFound(
			AccountNotFoundException enfe)
	{
		return new ResponseEntity<String>(
				enfe.getMessage(),HttpStatus.NOT_FOUND);

	}
}
