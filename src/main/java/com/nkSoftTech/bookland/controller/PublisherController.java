package com.nkSoftTech.bookland.controller;

import com.nkSoftTech.bookland.dto.request_response_dto.RRPublisherDTO;
import com.nkSoftTech.bookland.repository.PublisherRepo;
import com.nkSoftTech.bookland.service.PublisherService;
import com.nkSoftTech.bookland.utils.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/publisher")
@CrossOrigin
public class PublisherController {
  @Autowired
  PublisherService publisherService;
  @PostMapping("${api.v1.save-publisher}")
  public ResponseEntity<StandardResponse> savePublisher(@RequestBody RRPublisherDTO publisherDTO) {
    long id = publisherService.savePublisher(publisherDTO);
    return new ResponseEntity<StandardResponse>(new StandardResponse(200,"success",id), HttpStatus.CREATED);
  }
}
