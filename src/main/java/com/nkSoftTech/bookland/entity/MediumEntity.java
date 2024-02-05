package com.nkSoftTech.bookland.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "medium")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class MediumEntity {
  @Id
  @Column(name = "medium_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long mediumId;

  @Column(name = "medium_type",length = 100, nullable = false)
  private String mediumType;

  @OneToMany(mappedBy="mediumEntity")
  private List<BookEntity> bookEntityList;

  public MediumEntity(String mediumType) {
    this.mediumType = mediumType;
  }
}
