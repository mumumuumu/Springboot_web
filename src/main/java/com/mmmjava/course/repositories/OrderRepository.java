package com.mmmjava.course.repositories;

import com.mmmjava.course.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
