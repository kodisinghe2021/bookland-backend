package com.nkSoftTech.bookland.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "author")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AuthorEntity {
  @Id
  @Column(name = "author_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long authorId;

  @Column(name = "author_name", length = 100, nullable = false)
  private String authorName;

    @OneToMany(mappedBy="authorEntity")
    private List<BookEntity> bookEntityList;


  public AuthorEntity(String authorName) {
    this.authorName = authorName;
  }
}
