package com.mmmjava.course.repositories;

import com.mmmjava.course.Entities.OrderItem;
import com.mmmjava.course.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
