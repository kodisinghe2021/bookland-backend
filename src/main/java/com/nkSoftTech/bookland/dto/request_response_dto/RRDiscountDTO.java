package com.nkSoftTech.bookland.dto.request_response_dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class RRDiscountDTO {
  private long discountId;
  private double discountPercentage;
  private Date activatingDate;
  private Date expireDate;

  public RRDiscountDTO(double discountPercentage, Date activatingDate, Date expireDate) {
    this.discountPercentage = discountPercentage;
    this.activatingDate = activatingDate;
    this.expireDate = expireDate;
  }
}
