package com.nkSoftTech.bookland.service.Impl;

import com.nkSoftTech.bookland.dto.request_response_dto.RRGradeDTO;
import com.nkSoftTech.bookland.exception.AlreadyBoundException;
import com.nkSoftTech.bookland.repository.GradeRepo;
import com.nkSoftTech.bookland.service.BookService;
import com.nkSoftTech.bookland.service.GradeService;
import com.nkSoftTech.bookland.utils.mappers.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
  @Autowired
  GradeRepo gradeRepo;
  Mappers mappers = new Mappers();
  @Override
  public long saveGrade(RRGradeDTO gradeDTO) {
    try {
      if(!gradeRepo.existsByGradeNameEquals(gradeDTO.getGradeName())){
        return gradeRepo.save(mappers.gradeEntityForCreate(gradeDTO)).getGradeId();
      }else {
      throw new AlreadyBoundException("grade-already-available");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
