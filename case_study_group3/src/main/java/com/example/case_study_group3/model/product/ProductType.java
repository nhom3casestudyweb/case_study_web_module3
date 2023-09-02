package com.example.case_study_group3.model.product;

public class ProductType {
    private int id;
    private String product_type;

    public ProductType(int id, String product_type) {
        this.id = id;
        this.product_type = product_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }
}
