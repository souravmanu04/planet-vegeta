package com.example.Product.service;

import com.example.Product.model.ProductBean;
import com.example.Product.repository.ProductRepsoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepsoitory productRepsoitory;

    public ProductBean addProduct(ProductBean productBean) {
        productRepsoitory.save(productBean);
        return productBean;
    }

    public List<ProductBean> getAllProducts() {
        List<ProductBean> products = new ArrayList<>();
        productRepsoitory.findAll().forEach(prod -> products.add(prod));
        System.out.println(products.size());
        return products;
    }

    public void delete(int id) {
        productRepsoitory.deleteById(id);
    }

    public Optional<ProductBean> getProductById(int id){
        return productRepsoitory.findById(id);
    }

    public String updateName(int id, ProductBean p) {
        Optional<ProductBean> prod = productRepsoitory.findById(id);
        if (prod.isEmpty()) {
            return "Invalid id";
        }
        else {
            prod.get().setPrice(p.getPrice());
            productRepsoitory.save(prod.get());
            return "Updated";
        }
    }


    public String updateCategory(int id, ProductBean p) {
        Optional<ProductBean> prod = productRepsoitory.findById(id);
        if (prod.isEmpty()) {
            return "Invalid id";
        }
        else {
            prod.get().setProductCategory(p.getProductCategory());
            productRepsoitory.save(prod.get());
            return "Updated";
        }
    }

    public String updateBrand(int id, ProductBean p) {
        Optional<ProductBean> prod = productRepsoitory.findById(id);
        if (prod.isEmpty()) {
            return "Invalid id";
        }
        else {
            prod.get().setProductBrand(p.getProductBrand());
            productRepsoitory.save(prod.get());
            return "Updated";
        }
    }

    public String updatePrice(int id, ProductBean p) {
        Optional<ProductBean> prod = productRepsoitory.findById(id);
        if (prod.isEmpty()) {
            return "Invalid id";
        }
        else {
            prod.get().setPrice(p.getPrice());
            productRepsoitory.save(prod.get());
            return "Updated";
        }
    }
}
