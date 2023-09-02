package com.example.case_study_group3.model.product;

import java.util.List;

public class Product {
    private int id;
    private String name;
    private int price;
    private String description;
    private int inventory;
    List<ProductImages> productImages ;
    ProductType productType;

    public Product(int id, String name, int price, String description, int inventory, List<ProductImages> productImages,
                   ProductType productType)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.inventory = inventory;
        this.productImages = productImages;
        this.productType = productType;
    }

    public Product(String name, int price, String description, int inventory, List<ProductImages> productImages,
                   ProductType productType) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.inventory = inventory;
        this.productImages = productImages;
        this.productType = productType;
    }

    public Product(String name, int price, String description, int inventory, ProductType productType) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.inventory = inventory;
        this.productType = productType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public List<ProductImages> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<ProductImages> productImages) {
        this.productImages = productImages;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
