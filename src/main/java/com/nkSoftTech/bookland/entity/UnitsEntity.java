package com.nkSoftTech.bookland.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "unit")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UnitsEntity {
  @Id
  @Column(name = "unit_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long unitId;

  @Column(name = "unit_name", length = 100, nullable = false)
  private String unitName;

  @OneToMany(mappedBy="unitsEntity")
  private List<BookEntity> bookEntityList;

  public UnitsEntity(String unitName) {
    this.unitName = unitName;
  }
}
