package com.example.case_study_group3.repository.product;

import com.example.case_study_group3.model.product.Product;

import java.util.Map;

public interface IProductRepository {
    void insertProduct(Product product);
    Product searchProductById(int id);
    Map<Integer, Product> searchAll();
    Map<Integer,Product> searchProductByType(int productTypeID);
    void updateProduct(int id, Product product);
    Map<Integer, Product> searchProductHot();


}
