package com.nkSoftTech.bookland.service.Impl;

import com.nkSoftTech.bookland.dto.request_response_dto.RRPublisherDTO;
import com.nkSoftTech.bookland.exception.AlreadyBoundException;
import com.nkSoftTech.bookland.repository.PublisherRepo;
import com.nkSoftTech.bookland.service.BookService;
import com.nkSoftTech.bookland.service.PublisherService;
import com.nkSoftTech.bookland.utils.mappers.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherServiceImpl implements PublisherService {
  @Autowired
  PublisherRepo publisherRepo;

  Mappers mappers = new Mappers();
  @Override
  public long savePublisher(RRPublisherDTO publisherDTO) {
    if(! publisherRepo.existsByPublisherNameEquals(publisherDTO.getPublisherName())){
 return publisherRepo.save(mappers.publisherEntityForCreate(publisherDTO)).getPublisherID();
    }else {
      throw new AlreadyBoundException("publisher-already-available");
    }
  }
}
