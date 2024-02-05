package com.nkSoftTech.bookland.controller;

import com.nkSoftTech.bookland.dto.request_response_dto.RRSubjectDTO;
import com.nkSoftTech.bookland.service.SubjectService;
import com.nkSoftTech.bookland.utils.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/subject")
@CrossOrigin
public class SubjectController {
  @Autowired
  SubjectService subjectService;
  @PostMapping("${api.v1.save-subject}")
  public ResponseEntity<StandardResponse> saveSubject(@RequestBody RRSubjectDTO subjectDTO) {
    long id = subjectService.saveSubject(subjectDTO);
    return new ResponseEntity<StandardResponse>(new StandardResponse(200,"success",id), HttpStatus.CREATED);
  }
}
