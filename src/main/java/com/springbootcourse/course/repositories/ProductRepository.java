package com.springbootcourse.course.repositories;

import com.springbootcourse.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
