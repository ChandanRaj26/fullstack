package com.codewithchandan.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(Long id)
	{
		super("Sorry this user is not available in our system having id is "+id);
	}

}
