package com.nkSoftTech.bookland.dto.request_dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestCreateBookDTO {
  private String bookName;
  private int pageCount;
  private String imageUrl;
  private double sellingPrice;
  private double buyingPrice;
  private double availableQuantity;
  private long unitsId;
  private long authorId;
  private long subjectId;
  private long publisherId;
  private long gradeId;
  private long discountId;
  private long mediumId;
}
