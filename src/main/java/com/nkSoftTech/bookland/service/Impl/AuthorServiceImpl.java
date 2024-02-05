package com.nkSoftTech.bookland.service.Impl;

import com.nkSoftTech.bookland.dto.request_response_dto.RRAuthorDTO;
import com.nkSoftTech.bookland.exception.AlreadyBoundException;
import com.nkSoftTech.bookland.repository.AuthorRepo;
import com.nkSoftTech.bookland.service.AuthorService;
import com.nkSoftTech.bookland.service.BookService;
import com.nkSoftTech.bookland.utils.mappers.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
  @Autowired
  AuthorRepo authorRepo;
  Mappers mappers = new Mappers();
  @Override
  public long saveAuthor(RRAuthorDTO authorDTO) {
    try {
     boolean isAvailable = authorRepo.existsByAuthorNameEquals(authorDTO.getAuthorName());
      System.out.println("Already available in this name");
      if(!isAvailable){
      long id = authorRepo.save(mappers.authorEntityForCreate(authorDTO)).getAuthorId();
      return id;
      }else {
        throw new AlreadyBoundException("author-already-available");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
