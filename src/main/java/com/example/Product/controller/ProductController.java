package com.example.Product.controller;

import com.example.Product.model.ProductBean;
import com.example.Product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<ProductBean> saveProduct(@RequestBody ProductBean product) throws Exception {
        ProductBean productSavedToDB = this.productService.addProduct(product);
        return new ResponseEntity<ProductBean>(productSavedToDB, HttpStatus.CREATED);
    }

    @GetMapping("/get")
    private List<ProductBean> getAllProducts() {
        return productService.getAllProducts();
    }

    @DeleteMapping("del/{id}")
    private void delete(@PathVariable("id") int id) {
        productService.delete(id);
    }

    @GetMapping("/get/{id}")
    private Optional<ProductBean> getProductById(@PathVariable("id")int id) {
        return productService.getProductById(id);
    }

    @PutMapping("/putName/{id}")
    private String updateName(@PathVariable("id") int id, @RequestBody ProductBean p) {
        return productService.updateName(id, p);
    }

    @PutMapping("/putCat/{id}")
    private String updateCategory(@PathVariable("id") int id, @RequestBody ProductBean p) {
        return productService.updateCategory(id, p);
    }

    @PutMapping("/putBrand/{id}")
    private String updateBrand(@PathVariable("id") int id, @RequestBody ProductBean p) {
        return productService.updateBrand(id, p);
    }

    @PutMapping("/putPrice/{id}")
    private String updatePrice(@PathVariable("id") int id, @RequestBody ProductBean p) {
        return productService.updatePrice(id, p);
    }

}
