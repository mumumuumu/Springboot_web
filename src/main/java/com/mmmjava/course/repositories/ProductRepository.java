package com.mmmjava.course.repositories;

import com.mmmjava.course.Entities.Category;
import com.mmmjava.course.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
