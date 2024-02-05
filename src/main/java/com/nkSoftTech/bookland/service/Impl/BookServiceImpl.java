package com.nkSoftTech.bookland.service.Impl;

import com.nkSoftTech.bookland.dto.request_dto.RequestCreateBookDTO;
import com.nkSoftTech.bookland.entity.*;
import com.nkSoftTech.bookland.exception.AlreadyBoundException;
import com.nkSoftTech.bookland.repository.*;
import com.nkSoftTech.bookland.service.BookService;
import com.nkSoftTech.bookland.utils.key_maker.KeyMaker;
import com.nkSoftTech.bookland.utils.mappers.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
  @Autowired
  BookRepo bookRepo;
  @Autowired
  AuthorRepo authorRepo;
  @Autowired
  SubjectRepo subjectRepo;
  @Autowired
  PublisherRepo publisherRepo;
  @Autowired
  GradeRepo gradeRepo;
  @Autowired
  DiscountRepo discountRepo;
  @Autowired
  MediumRepo mediumRepo;
  @Autowired
  UnitsRepo unitsRepo;
  @Autowired
  Mappers mappers;
  @Autowired
  KeyMaker keyMaker;

  @Override
  public long saveBook(RequestCreateBookDTO bookDTO) {
    try {
      String bookCode = keyMaker.createBookCode(bookDTO.getBookName(), bookDTO.getAuthorId(), bookDTO.getPublisherId(), bookDTO.getMediumId(), bookDTO.getGradeId());
      if (!bookRepo.existsByBookCodeEquals(bookCode)) {
        return bookRepo.save(mappers.bookDTOtoEntity(
                bookDTO,
                bookCode,
                (AuthorEntity) authorRepo.findById(bookDTO.getAuthorId()).get(),
                (SubjectEntity) subjectRepo.findById(bookDTO.getSubjectId()).get(),
                (PublisherEntity) publisherRepo.findById(bookDTO.getPublisherId()).get(),
                (GradeEntity) gradeRepo.findById(bookDTO.getGradeId()).get(),
                (DiscountEntity) discountRepo.findById(bookDTO.getDiscountId()).get(),
                (MediumEntity) mediumRepo.findById(bookDTO.getMediumId()).get(),
                (UnitsEntity) unitsRepo.findById(bookDTO.getUnitsId()).get()
        )).getBookId();
      } else {
        throw new AlreadyBoundException("book-already-available");
      }
    } catch (AlreadyBoundException e) {
      throw new RuntimeException(e);
    }
  }
}
