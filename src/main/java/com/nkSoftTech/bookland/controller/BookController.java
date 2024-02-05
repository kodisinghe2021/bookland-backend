package com.nkSoftTech.bookland.controller;

import com.nkSoftTech.bookland.dto.request_dto.RequestCreateBookDTO;
import com.nkSoftTech.bookland.service.BookService;
import com.nkSoftTech.bookland.utils.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/book")
@CrossOrigin
public class BookController {
  @Autowired
  BookService bookService;

  @PostMapping("${api.v1.save-book}")
  public ResponseEntity<StandardResponse> saveBook(@RequestBody RequestCreateBookDTO bookDTO) {
    long id = bookService.saveBook(bookDTO);
    return new ResponseEntity<StandardResponse>(new StandardResponse(200,"success",""), HttpStatus.CREATED);
  }


}
