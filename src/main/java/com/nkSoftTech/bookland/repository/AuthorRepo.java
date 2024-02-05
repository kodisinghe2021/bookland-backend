package com.nkSoftTech.bookland.repository;

import com.nkSoftTech.bookland.entity.AuthorEntity;
import com.nkSoftTech.bookland.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface AuthorRepo extends JpaRepository<AuthorEntity, Long> {
  boolean existsByAuthorNameEquals(String authorName);
}
