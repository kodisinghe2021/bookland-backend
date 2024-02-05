package com.nkSoftTech.bookland.controller;

import com.nkSoftTech.bookland.dto.request_response_dto.RRDiscountDTO;
import com.nkSoftTech.bookland.service.DiscountService;
import com.nkSoftTech.bookland.utils.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/discount")
@CrossOrigin
public class DiscountController {
  @Autowired
  DiscountService discountService;
  @PostMapping("${api.v1.save-discount}")
  public ResponseEntity<StandardResponse> saveDiscount(@RequestBody RRDiscountDTO discountDTO) {
    long resultId = discountService.saveDiscount(discountDTO);
    return new ResponseEntity<StandardResponse>(new StandardResponse(200,"success",resultId), HttpStatus.CREATED);
  }
}
