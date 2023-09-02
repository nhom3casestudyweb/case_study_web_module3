package com.example.case_study_group3.model.product;

public class ProductImages {
    private int id;
    private String url;
    private Product product;

    public ProductImages(int id, String url, Product product) {
        this.id = id;
        this.url = url;
        this.product = product;
    }

    public ProductImages(int id, String url) {
        this.id = id;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
