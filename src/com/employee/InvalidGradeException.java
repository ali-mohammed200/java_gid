package com.employee;

public class InvalidGradeException extends Exception {

	public InvalidGradeException(String grade) {
		super(grade + " is an invalid grade!");
	}
}