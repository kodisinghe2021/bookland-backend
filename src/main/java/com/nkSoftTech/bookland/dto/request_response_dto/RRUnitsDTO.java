package com.nkSoftTech.bookland.dto.request_response_dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class RRUnitsDTO {
  private long unitId;
  private String unitName;

  public RRUnitsDTO(String unitName) {
    this.unitName = unitName;
  }
}
