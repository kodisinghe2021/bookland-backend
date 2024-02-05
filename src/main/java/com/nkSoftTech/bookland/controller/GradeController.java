package com.nkSoftTech.bookland.controller;

import com.nkSoftTech.bookland.dto.request_response_dto.RRGradeDTO;
import com.nkSoftTech.bookland.service.GradeService;
import com.nkSoftTech.bookland.utils.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/grade")
@CrossOrigin
public class GradeController {
  @Autowired
  GradeService gradeService;
  @PostMapping("${api.v1.save-grade}")
  public ResponseEntity<StandardResponse> saveGrade(@RequestBody RRGradeDTO gradeDTO) {
    long id = gradeService.saveGrade(gradeDTO);
    return new ResponseEntity<StandardResponse>(new StandardResponse(200,"success",id), HttpStatus.CREATED);
  }
}
