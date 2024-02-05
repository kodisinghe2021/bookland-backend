package com.nkSoftTech.bookland.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subject")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SubjectEntity {
  @Id
  @Column(name = "book_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long subjectId;

  @Column(name = "subject_name",length = 100, nullable = false)
  private String subjectName;

  @OneToMany(mappedBy="subjectEntity")
  private List<BookEntity> bookEntityList;

  public SubjectEntity(String subjectName) {
    this.subjectName = subjectName;
  }
}
