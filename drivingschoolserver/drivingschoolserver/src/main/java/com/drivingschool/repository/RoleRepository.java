package com.drivingschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drivingschool.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
