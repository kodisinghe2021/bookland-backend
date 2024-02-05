package com.nkSoftTech.bookland.repository;

import com.nkSoftTech.bookland.entity.BookEntity;
import com.nkSoftTech.bookland.entity.PublisherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface BookRepo extends JpaRepository<BookEntity, Long> {
  boolean existsByBookCodeEquals(String bookCode);
}