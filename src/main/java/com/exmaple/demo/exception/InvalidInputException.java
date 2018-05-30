package com.exmaple.demo.exception;

public class InvalidInputException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ErrorObject apiError;

	public InvalidInputException() {
		super();
	}

	public InvalidInputException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidInputException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidInputException(String message,ErrorObject error) {
		super(message);
		this.apiError = error;
	}

	public InvalidInputException(Throwable cause) {
		super(cause);
	}

	public ErrorObject getApiError() {
		return apiError;
	}

	public void setApiError(ErrorObject apiError) {
		this.apiError = apiError;
	}


}
