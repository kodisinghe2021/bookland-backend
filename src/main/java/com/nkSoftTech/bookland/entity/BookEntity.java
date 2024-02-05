package com.nkSoftTech.bookland.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "book")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BookEntity {
  @Id
  @Column(name = "book_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long bookId;

  @Column(name = "book_code", length = 1000, nullable = false, unique = true, updatable = false)
  private String bookCode;

  @Column(name = "book_name", length = 100, nullable = false)
  private String bookName;

  @Column(name = "page_count", columnDefinition = "INT", nullable = false)
  private int pageCount;

  @Column(name = "image_url", nullable = false)
  private String imageUrl;

  @Column(name = "selling_price", columnDefinition = "DOUBLE", nullable = false)
  private double sellingPrice;

  @Column(name = "buying_price", columnDefinition = "DOUBLE", nullable = false)
  private double buyingPrice;

  @Column(name = "likes_count", columnDefinition = "INT", nullable = false)
  private int likesCount;

  @Column(name = "dislikes_count", columnDefinition = "INT", nullable = false)
  private int disLikesCount;

  @Column(name = "rating_percentage", columnDefinition = "DOUBLE", nullable = false)
  private double ratingPercentage;

  @Column(name = "available_quantity", columnDefinition = "DOUBLE", nullable = false)
  private double availableQuantity;

  @ManyToOne
  @JoinColumn(name = "author_id", nullable = false)
  private AuthorEntity authorEntity;

  @ManyToOne
  @JoinColumn(name = "subject_id", nullable = false)
  private SubjectEntity subjectEntity;

  @ManyToOne
  @JoinColumn(name = "publisher_id", nullable = false)
  private PublisherEntity publisherEntity;

  @ManyToOne
  @JoinColumn(name = "grade_id", nullable = false)
  private GradeEntity gradeEntity;

  @ManyToOne
  @JoinColumn(name = "discount_id", nullable = false)
  private DiscountEntity discountEntity;

  @ManyToOne
  @JoinColumn(name = "medium_id", nullable = false)
  private MediumEntity mediumEntity;

  @ManyToOne
  @JoinColumn(name = "unit_id", nullable = false)
  private UnitsEntity unitsEntity;

  public BookEntity(
          String bookName,
          String bookCode,
          int pageCount,
          String imageUrl,
          double sellingPrice,
          double buyingPrice,
          int likesCount,
          int disLikesCount,
          double ratingPercentage,
          double availableQuantity,
          AuthorEntity authorEntity,
          SubjectEntity subjectEntity,
          PublisherEntity publisherEntity,
          GradeEntity gradeEntity,
          DiscountEntity discountEntity,
          MediumEntity mediumEntity,
          UnitsEntity unitsEntity
  ) {
    this.bookName = bookName;
    this.bookCode = bookCode;
    this.pageCount = pageCount;
    this.imageUrl = imageUrl;
    this.sellingPrice = sellingPrice;
    this.buyingPrice = buyingPrice;
    this.likesCount = likesCount;
    this.disLikesCount = disLikesCount;
    this.ratingPercentage = ratingPercentage;
    this.availableQuantity = availableQuantity;
    this.authorEntity = authorEntity;
    this.subjectEntity = subjectEntity;
    this.publisherEntity = publisherEntity;
    this.gradeEntity = gradeEntity;
    this.discountEntity = discountEntity;
    this.mediumEntity = mediumEntity;
    this.unitsEntity = unitsEntity;
  }
}
