package com.nkSoftTech.bookland.controller;

import com.nkSoftTech.bookland.dto.request_response_dto.RRUnitsDTO;
import com.nkSoftTech.bookland.service.UnitsService;
import com.nkSoftTech.bookland.utils.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/units")
@CrossOrigin
public class UnitsController {
  @Autowired
  UnitsService unitsService;
  @PostMapping("${api.v1.save-units}")
  public ResponseEntity<StandardResponse> saveUnits(@RequestBody RRUnitsDTO unitsDTO) {
  long id =  unitsService.saveUnit(unitsDTO);
    return new ResponseEntity<>(new StandardResponse(200,"success",id), HttpStatus.CREATED);
  }
}
