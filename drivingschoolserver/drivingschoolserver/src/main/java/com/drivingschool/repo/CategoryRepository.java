package com.drivingschool.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drivingschool.model.driving.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
