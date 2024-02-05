package com.nkSoftTech.bookland.dto.request_response_dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class RRMediumDTO {
  private long mediumId;
  private String mediumType;

  public RRMediumDTO(String activatingDate) {
    this.mediumType = mediumType;
  }
}
