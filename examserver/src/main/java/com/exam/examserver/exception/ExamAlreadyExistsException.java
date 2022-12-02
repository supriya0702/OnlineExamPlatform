package com.exam.examserver.exception;

public class ExamAlreadyExistsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExamAlreadyExistsException(String message) {
		super(message);
	}

}
