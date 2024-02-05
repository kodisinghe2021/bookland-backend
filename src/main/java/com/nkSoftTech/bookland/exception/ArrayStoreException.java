package com.nkSoftTech.bookland.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.EXPECTATION_FAILED)
public class ArrayStoreException extends RuntimeException{
  public ArrayStoreException(String message){
    super(message);
  }
}
