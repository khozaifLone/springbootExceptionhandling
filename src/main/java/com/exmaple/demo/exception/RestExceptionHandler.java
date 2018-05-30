package com.exmaple.demo.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

   @ExceptionHandler(InvalidInputException.class)
   protected ResponseEntity<Object> handleEntityNotFound(
		   InvalidInputException ex) {
       ErrorObject apiError = new ErrorObject(ex.getApiError().getStatus());
       apiError.setMessage(ex.getMessage());
       return buildResponseEntity(apiError);
   }
   
   private ResponseEntity<Object> buildResponseEntity(ErrorObject apiError) {
       return new ResponseEntity<>(apiError, apiError.getStatus());
   }
}