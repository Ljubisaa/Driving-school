package com.drivingschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drivingschool.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
