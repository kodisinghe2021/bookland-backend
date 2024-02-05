package com.nkSoftTech.bookland.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "discount")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DiscountEntity {
  @Id
  @Column(name = "discount_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long discountId;

  @Column(name = "discount_percentage",columnDefinition = "DOUBLE")
  private double discountPercentage;

  @Column(name = "activating_date",columnDefinition = "DATETIME")
  private Date activatingDate;

  @Column(name = "expire_date",columnDefinition = "DATETIME")
  private Date expireDate;

  @OneToMany(mappedBy="discountEntity")
  private List<BookEntity> bookEntityList;

  public DiscountEntity(double discountPercentage, Date activatingDate, Date expireDate) {
    this.discountPercentage = discountPercentage;
    this.activatingDate = activatingDate;
    this.expireDate = expireDate;
  }
}
