package com.example.case_study_group3.repository.product;

import com.example.case_study_group3.model.product.Product;

import java.util.Map;

public class ProductRepository implements IProductRepository {
    private static final String INSERT_PRODUCT = "INSERT INTO product(product_name,product_price,product_description,product_type_id,product_inventory)" +
            "values(?,?,?,?,?);";
    private static final String SELECT_ALL ="SELECT * FROM product;";
    private static final String
    @Override
    public void insertProduct(Product product) {

    }

    @Override
    public Product searchProductById(int id) {
        return null;
    }

    @Override
    public Map<Integer, Product> searchAll() {
        return null;
    }

    @Override
    public Map<Integer, Product> searchProductByType(int productTypeID) {
        return null;
    }

    @Override
    public void updateProduct(int id, Product product) {

    }

    @Override
    public Map<Integer, Product> searchProductHot() {
        return null;
    }
}
