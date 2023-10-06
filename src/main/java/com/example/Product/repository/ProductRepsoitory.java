package com.example.Product.repository;

import com.example.Product.model.ProductBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepsoitory extends JpaRepository<ProductBean, Integer> {
}
