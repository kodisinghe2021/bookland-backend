package com.nkSoftTech.bookland.repository;

import com.nkSoftTech.bookland.entity.BookEntity;
import com.nkSoftTech.bookland.entity.DiscountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface DiscountRepo extends JpaRepository<DiscountEntity, Long> {
  boolean existsByDiscountPercentageEquals(double discountPercentage);
}
