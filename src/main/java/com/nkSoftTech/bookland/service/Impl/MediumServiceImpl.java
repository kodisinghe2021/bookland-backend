package com.nkSoftTech.bookland.service.Impl;

import com.nkSoftTech.bookland.dto.request_response_dto.RRMediumDTO;
import com.nkSoftTech.bookland.exception.AlreadyBoundException;
import com.nkSoftTech.bookland.repository.MediumRepo;
import com.nkSoftTech.bookland.service.BookService;
import com.nkSoftTech.bookland.service.MediumService;
import com.nkSoftTech.bookland.utils.mappers.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MediumServiceImpl implements MediumService {
  @Autowired
  MediumRepo mediumRepo;
  Mappers mappers = new Mappers();
  @Override
  public long saveMedium(RRMediumDTO mediumDTO) {
    try {
      if(!mediumRepo.existsByMediumTypeEquals(mediumDTO.getMediumType().toLowerCase())){
       return mediumRepo.save(mappers.mediumEntityForCreate(mediumDTO)).getMediumId();
      }else{
        throw new AlreadyBoundException("medium-already-available");
      }
    } catch (AlreadyBoundException e) {
      throw new RuntimeException(e);
    }
  }
}
