package com.example.case_study_group3.repository.product;

import com.example.case_study_group3.model.product.ProductType;

import java.util.Map;

public interface IProductTypeRepository {
    ProductType selectProductType(int id);

    Map<Integer, ProductType> selectAllProductType();
}
