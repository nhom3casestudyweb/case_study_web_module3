package com.example.case_study_group3.repository.product;

import com.example.case_study_group3.model.product.ProductImages;

import java.util.List;

public interface IProductImagesRepository {
    void insertImages(ProductImages productImages);
    void updateImages(int id, ProductImages productImages);
    List<ProductImages> searchImagesByProduct(int id);
    void deleteImages(int id);
    void deleteImagesById(int id);
}
