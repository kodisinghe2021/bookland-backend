package com.nkSoftTech.bookland.service.Impl;

import com.nkSoftTech.bookland.dto.request_response_dto.RRSubjectDTO;
import com.nkSoftTech.bookland.exception.AlreadyBoundException;
import com.nkSoftTech.bookland.repository.SubjectRepo;
import com.nkSoftTech.bookland.service.BookService;
import com.nkSoftTech.bookland.service.SubjectService;
import com.nkSoftTech.bookland.utils.mappers.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {
  @Autowired
  SubjectRepo subjectRepo;
  Mappers mappers = new Mappers();

  @Override
  public long saveSubject(RRSubjectDTO subjectDTO) {
    try {
      if (!subjectRepo.existsBySubjectNameEquals(subjectDTO.getSubjectName())
      ) {
        return subjectRepo.save(mappers.toSubjectEntity(subjectDTO)).getSubjectId();
      } else {
        throw new AlreadyBoundException("subject-already-available");
      }
    } catch (AlreadyBoundException e) {
      throw new RuntimeException(e);
    }
  }
}
