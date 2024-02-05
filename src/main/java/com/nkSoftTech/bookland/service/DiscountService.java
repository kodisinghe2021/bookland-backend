package com.nkSoftTech.bookland.service;


import com.nkSoftTech.bookland.dto.request_response_dto.RRDiscountDTO;

public interface DiscountService {
  long saveDiscount(RRDiscountDTO discountDTO);
}
