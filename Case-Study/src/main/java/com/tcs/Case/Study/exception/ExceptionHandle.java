package com.tcs.Case.Study.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

public class ExceptionHandle {

	@ExceptionHandler(NumberFormatException.class)
	public ResponseEntity<?> handleNumberFormatException(NumberFormatException exception, WebRequest request)
	{
		ErrorDetails errorDetails = new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity(errorDetails,HttpStatus.BAD_REQUEST);
	}
}
