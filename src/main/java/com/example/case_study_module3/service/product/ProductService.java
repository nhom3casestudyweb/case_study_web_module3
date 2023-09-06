package com.example.case_study_module3.service.product;

import com.example.case_study_module3.model.product.Product;
import com.example.case_study_module3.repository.product.IProductRepository;
import com.example.case_study_module3.repository.product.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> showListChair() {
        return productRepository.showListChair();
    }

    @Override
    public List<Product> showListDesk() {
        return productRepository.showListDesk();
    }

    @Override
    public List<Product> showListAccessories() {
        return productRepository.showListAccessories();
    }
}
