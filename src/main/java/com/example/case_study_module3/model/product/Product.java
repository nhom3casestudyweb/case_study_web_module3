package com.example.case_study_module3.model.product;

public class Product extends ProductImages {
    private int productId;
    private String productName;
    private double productPrice;
    private double oldPrice;
    private String productDescription;
    private int productTypeId;
    private int productInventory;

    public Product() {
    }

    public Product(String productName, double productPrice, String productDescription, int productTypeId, int productInventory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productTypeId = productTypeId;
        this.productInventory = productInventory;
    }

    public Product(int productId, String productName, double productPrice, double oldPrice, String productDescription, int productTypeId, int productInventory) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.oldPrice = oldPrice;
        this.productDescription = productDescription;
        this.productTypeId = productTypeId;
        this.productInventory = productInventory;
    }

    public Product(int productImagesId, String imagesUrl, String erasingImg, int productId, String productName, double productPrice, double oldPrice, String productDescription, int productTypeId, int productInventory) {
        super(productImagesId, imagesUrl, erasingImg);
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.oldPrice = oldPrice;
        this.productDescription = productDescription;
        this.productTypeId = productTypeId;
        this.productInventory = productInventory;
    }

    //contructor này được tạo ra để phục vụ cho show product
    public Product(String imagesUrl, String erasingImg, int productId, String productName, double productPrice, double oldPrice, String productDescription, int productInventory) {
        super(imagesUrl, erasingImg);
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.oldPrice = oldPrice;
        this.productDescription = productDescription;
        this.productInventory = productInventory;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    public int getProductInventory() {
        return productInventory;
    }

    public void setProductInventory(int productInventory) {
        this.productInventory = productInventory;
    }
}
