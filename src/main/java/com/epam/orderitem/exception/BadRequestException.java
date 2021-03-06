package com.epam.orderitem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author taqiul.rizvi
 *
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {
	 /**
	 * 
	 */
	private static final long serialVersionUID = -2810007549071891264L;

	public BadRequestException(String exception) {
	        super(exception);
	    }
}
