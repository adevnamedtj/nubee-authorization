package com.tejio.oj.nubee.authorization.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.tejio.oj.nubee.authorization.model.ErrorResponse;

@ControllerAdvice
@RestController
public class NubeeExceptionHandler extends ResponseEntityExceptionHandler {

	  @ExceptionHandler(Exception.class)
	  public final ResponseEntity<ErrorResponse> handleAllExceptions(Exception ex, WebRequest request) {
		  ErrorResponse exceptionResponse = new ErrorResponse(ex.getMessage(), "99999");
	    return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	  
	  @ExceptionHandler(NubeeApplicationException.class)
	  public final ResponseEntity<ErrorResponse> handleAllExceptions(NubeeApplicationException ex, WebRequest request) {
		  ErrorResponse errResponse = new ErrorResponse(ex.getErrorMessage(),ex.getErrorCode());
	    return new ResponseEntity<>(errResponse, ex.getResponseStatus());
	  }
}
