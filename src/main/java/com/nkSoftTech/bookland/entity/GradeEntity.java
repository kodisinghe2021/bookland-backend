package com.nkSoftTech.bookland.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "grade")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class GradeEntity {
  @Id
  @Column(name = "grade_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long gradeId;

  @Column(name = "grade_name",length = 20, nullable = false)
  private String gradeName;

  @OneToMany(mappedBy="gradeEntity")
  private List<BookEntity> bookEntityList;

  public GradeEntity(String gradeName) {
    this.gradeName = gradeName;
  }
}
