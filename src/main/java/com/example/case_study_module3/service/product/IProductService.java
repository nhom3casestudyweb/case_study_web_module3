package com.example.case_study_module3.service.product;

import com.example.case_study_module3.model.product.Product;

import java.util.List;

//package com.example.case_study_group3.service.product;
public interface IProductService {
    List<Product> showListChair();
    List<Product> showListDesk();
    List<Product> showListAccessories();
    Product finById(int productId);
}
