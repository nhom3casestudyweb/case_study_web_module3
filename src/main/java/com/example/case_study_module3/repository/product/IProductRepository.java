package com.example.case_study_module3.repository.product;

import com.example.case_study_module3.model.product.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> showListChair();
    List<Product> showListDesk();
    List<Product> showListAccessories();
    Product finById(int productId);
    List<Product> findByName(String searchName);
}
