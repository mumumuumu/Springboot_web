package com.mmmjava.course.repositories;

import com.mmmjava.course.Entities.Category;
import com.mmmjava.course.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
