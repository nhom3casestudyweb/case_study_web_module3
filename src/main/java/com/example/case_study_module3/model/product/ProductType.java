package com.example.case_study_module3.model.product;

public class ProductType {
    private int product_type_id;
    private String product_type_name;


    public ProductType() {
    }

    public ProductType(int product_type_id, String product_type_name) {
        this.product_type_id = product_type_id;
        this.product_type_name = product_type_name;
    }

    public int getProduct_type_id() {
        return product_type_id;
    }

    public void setProduct_type_id(int product_type_id) {
        this.product_type_id = product_type_id;
    }

    public String getProduct_type_name() {
        return product_type_name;
    }

    public void setProduct_type_name(String product_type_name) {
        this.product_type_name = product_type_name;
    }
}
