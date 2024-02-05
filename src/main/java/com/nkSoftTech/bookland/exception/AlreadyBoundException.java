package com.nkSoftTech.bookland.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.ALREADY_REPORTED)
public class AlreadyBoundException extends RuntimeException{
  public AlreadyBoundException(String message){
    super(message);
  }
}

