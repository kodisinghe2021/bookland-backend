package com.nkSoftTech.bookland.controller;

import com.nkSoftTech.bookland.dto.request_response_dto.RRAuthorDTO;
import com.nkSoftTech.bookland.service.AuthorService;
import com.nkSoftTech.bookland.utils.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/author")
@CrossOrigin
public class AuthorController {
  @Autowired
  AuthorService authorService;

  @PostMapping("${api.v1.save-author}")
  public ResponseEntity<StandardResponse> saveAuthor(@RequestBody RRAuthorDTO authorDTO) {
   long id = authorService.saveAuthor(authorDTO);
    return new ResponseEntity<StandardResponse>(new StandardResponse(200,"success",id), HttpStatus.CREATED);
  }
}
