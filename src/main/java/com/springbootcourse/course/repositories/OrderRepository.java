package com.springbootcourse.course.repositories;

import com.springbootcourse.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
