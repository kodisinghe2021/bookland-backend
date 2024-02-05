package com.nkSoftTech.bookland.dto.request_response_dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class RRGradeDTO {
  private long gradeId;
  private String gradeName;
  public RRGradeDTO(String gradeName) {
    this.gradeName = gradeName;
  }
}
