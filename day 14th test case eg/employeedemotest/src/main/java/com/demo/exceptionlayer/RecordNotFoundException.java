package com.demo.exceptionlayer;

public class RecordNotFoundException extends RuntimeException {

	public RecordNotFoundException(String messge) {

		super(messge);

	}
}
