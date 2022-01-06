package com.devsuperior.bds03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.bds03.entities.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
