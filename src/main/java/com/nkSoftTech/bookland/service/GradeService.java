package com.nkSoftTech.bookland.service;


import com.nkSoftTech.bookland.dto.request_response_dto.RRGradeDTO;

public interface GradeService {
  long saveGrade(RRGradeDTO gradeDTO);
}
