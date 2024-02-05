package com.nkSoftTech.bookland.service.Impl;

import com.nkSoftTech.bookland.dto.request_response_dto.RRUnitsDTO;
import com.nkSoftTech.bookland.exception.AlreadyBoundException;
import com.nkSoftTech.bookland.repository.UnitsRepo;
import com.nkSoftTech.bookland.service.BookService;
import com.nkSoftTech.bookland.service.UnitsService;
import com.nkSoftTech.bookland.utils.mappers.Mappers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class UnitsServiceImpl implements UnitsService {
  @Autowired
  UnitsRepo unitsRepo;

  @Autowired
  Mappers mappers;

  @Override
  public long saveUnit(RRUnitsDTO unitsDTO) {
    try {
      if (!unitsRepo.existsByUnitNameEquals(unitsDTO.getUnitName())) {
        log.info("sdfsdv");
        return unitsRepo.save(mappers.unitsDTOToEntity(unitsDTO)).getUnitId();
      } else {
        throw new AlreadyBoundException("units-already-available");
      }
    } catch (AlreadyBoundException e) {
      throw new RuntimeException(e);
    }
  }
}
