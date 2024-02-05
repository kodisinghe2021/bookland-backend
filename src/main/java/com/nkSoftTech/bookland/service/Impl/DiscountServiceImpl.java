package com.nkSoftTech.bookland.service.Impl;

import com.nkSoftTech.bookland.dto.request_response_dto.RRDiscountDTO;
import com.nkSoftTech.bookland.exception.AlreadyBoundException;
import com.nkSoftTech.bookland.repository.DiscountRepo;
import com.nkSoftTech.bookland.service.BookService;
import com.nkSoftTech.bookland.service.DiscountService;
import com.nkSoftTech.bookland.utils.mappers.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountServiceImpl implements DiscountService {
  @Autowired
  DiscountRepo discountRepo;

  Mappers mappers = new Mappers();

  @Override
  public long saveDiscount(RRDiscountDTO discountDTO) {
    try {
      boolean isAvailable = discountRepo.existsByDiscountPercentageEquals(discountDTO.getDiscountPercentage());
      if (!isAvailable) {
        return discountRepo.save(mappers.discountEntityForCreate(discountDTO)).getDiscountId();
      } else {
        throw new AlreadyBoundException("discount-already_available");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
