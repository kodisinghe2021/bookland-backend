package com.nkSoftTech.bookland.controller;

import com.nkSoftTech.bookland.dto.request_response_dto.RRMediumDTO;
import com.nkSoftTech.bookland.service.MediumService;
import com.nkSoftTech.bookland.utils.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/medium")
@CrossOrigin
public class MediumController {
  @Autowired
  MediumService mediumService;
  @PostMapping("${api.v1.save-medium}")
  public ResponseEntity<StandardResponse> saveMedium(@RequestBody RRMediumDTO mediumDTO) {
    long id = mediumService.saveMedium(mediumDTO);
    return new ResponseEntity<StandardResponse>(new StandardResponse(200,"success",id), HttpStatus.CREATED);
  }
}
