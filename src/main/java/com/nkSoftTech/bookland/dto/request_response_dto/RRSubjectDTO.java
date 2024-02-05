package com.nkSoftTech.bookland.dto.request_response_dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class RRSubjectDTO {
  private long subjectId;
  private String subjectName;

  public RRSubjectDTO(String subjectName) {
    this.subjectName = subjectName;
  }
}
