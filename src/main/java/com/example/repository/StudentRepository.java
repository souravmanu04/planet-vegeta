package com.example.repository;

import com.example.model.StudentBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentBean, Integer> {
}
