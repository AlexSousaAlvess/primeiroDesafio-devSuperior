package com.sds.desafio.one.services.exceptions;

public class DatabaseExcepetion extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DatabaseExcepetion(String msg) {
		super(msg);
	}
}
