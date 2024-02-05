package com.nkSoftTech.bookland.advicer;

import com.nkSoftTech.bookland.exception.AlreadyBoundException;
import com.nkSoftTech.bookland.exception.NotFoundException;
import com.nkSoftTech.bookland.exception.ArrayStoreException;
import com.nkSoftTech.bookland.utils.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandler {
  @ExceptionHandler(NotFoundException.class)
  public ResponseEntity<StandardResponse> handleNotFoundException(NotFoundException e) {
    return new ResponseEntity<StandardResponse>(new StandardResponse(404, "data-not-found", e.getMessage()), HttpStatus.NOT_FOUND);
  }
  @ExceptionHandler(AlreadyBoundException.class)
  public ResponseEntity<StandardResponse> handleAvailableException(AlreadyBoundException e) {
    return new ResponseEntity<StandardResponse>(new StandardResponse(406, "already-available", e.getMessage()), HttpStatus.ALREADY_REPORTED);
  }
  @ExceptionHandler(ArrayStoreException.class)
  public ResponseEntity<StandardResponse> storingFailed(ArrayStoreException e) {
    return new ResponseEntity<StandardResponse>(new StandardResponse(406, "save-failed", e.getMessage()), HttpStatus.EXPECTATION_FAILED);
  }
}
