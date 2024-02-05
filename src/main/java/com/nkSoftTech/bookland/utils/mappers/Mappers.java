package com.nkSoftTech.bookland.utils.mappers;

import com.nkSoftTech.bookland.dto.request_dto.RequestCreateBookDTO;
import com.nkSoftTech.bookland.dto.request_response_dto.*;
import com.nkSoftTech.bookland.entity.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Mappers {

  public AuthorEntity authorEntityForCreate(RRAuthorDTO authorDTO) {
    return new AuthorEntity(
            authorDTO.getAuthorName()
    );
  }

  public DiscountEntity discountEntityForCreate(RRDiscountDTO discountDTO) {
    return new DiscountEntity(
            discountDTO.getDiscountPercentage(),
            discountDTO.getActivatingDate(),
            discountDTO.getExpireDate()
    );
  }

  public GradeEntity gradeEntityForCreate(RRGradeDTO gradeDTO) {
    return new GradeEntity(
            gradeDTO.getGradeName()
    );
  }

  public MediumEntity mediumEntityForCreate(RRMediumDTO mediumDTO) {
    return new MediumEntity(
            mediumDTO.getMediumType()
    );
  }

  public PublisherEntity publisherEntityForCreate(RRPublisherDTO publisherDTO) {
    return new PublisherEntity(publisherDTO.getPublisherName());
  }

  public SubjectEntity toSubjectEntity(RRSubjectDTO subjectDTO) {
    return new SubjectEntity(subjectDTO.getSubjectName());
  }

  public UnitsEntity unitsDTOToEntity(RRUnitsDTO unitsDTO) {
    return new UnitsEntity(unitsDTO.getUnitName());
  }

  public BookEntity bookDTOtoEntity(
          RequestCreateBookDTO bookDTO,
          String bookCode,
          AuthorEntity authorEntity,
          SubjectEntity subjectEntity,
          PublisherEntity publisherEntity,
          GradeEntity gradeEntity,
          DiscountEntity discountEntity,
          MediumEntity mediumEntity,
          UnitsEntity unitsEntity

  ) {
    return new BookEntity(
            bookDTO.getBookName(),
            bookCode,
            bookDTO.getPageCount(),
            bookDTO.getImageUrl(),
            bookDTO.getSellingPrice(),
            bookDTO.getBuyingPrice(),
            0,
            0,
            0.0,
            bookDTO.getAvailableQuantity(),
            authorEntity,
            subjectEntity,
            publisherEntity,
            gradeEntity,
            discountEntity,
            mediumEntity,
            unitsEntity
    );
  }
}
