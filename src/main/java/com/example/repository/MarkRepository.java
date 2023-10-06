package com.example.repository;

import com.example.model.MarkBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkRepository extends JpaRepository<MarkBean, Integer> {
}
