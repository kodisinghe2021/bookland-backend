package com.nkSoftTech.bookland.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "publisher")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PublisherEntity {
  @Id
  @Column(name = "publisher_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long publisherID;

  @Column(name = "publisher_name",length = 100, nullable = false)
  private String publisherName;

  @OneToMany(mappedBy="publisherEntity")
  private List<BookEntity> bookEntityList;

  public PublisherEntity(String publisherName) {
    this.publisherName = publisherName;
  }
}
