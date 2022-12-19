package com.ssd.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ssd.model.Status;

@ControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<Object> handleException(Exception e) {

		Status status = new Status(e.getMessage(), 400);
		return new ResponseEntity<>(status, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(value = MyException.class)
	public ResponseEntity<Object> handleMyException(MyException e) {

		Status status = new Status(e.getMessage(), e.getStatus());
		return new ResponseEntity<>(status, HttpStatus.resolve(e.getStatus()));

	}

}
