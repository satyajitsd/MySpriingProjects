package com.ssd.exception;

public class MyException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	Integer status;

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}

	public MyException(String message, Integer status) {
		super(message);
		this.status = status;

	}

	public Integer getStatus() {
		return status;
	}

}
