package com.example.case_study_module3.model.product;

public class Product extends ProductImages{
    private int product_id;
    private String product_name;
    private double product_price;
    private double old_price;
    private String product_description;
    private int product_type_id;
    private int product_inventory;

    public Product() {
    }
    public Product(String product_name, double product_price, String product_description, int product_type_id, int product_inventory) {
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_description = product_description;
        this.product_type_id = product_type_id;
        this.product_inventory = product_inventory;
    }

    public Product(int product_id, String product_name, double product_price, double old_price, String product_description, int product_type_id, int product_inventory) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.old_price = old_price;
        this.product_description = product_description;
        this.product_type_id = product_type_id;
        this.product_inventory = product_inventory;
    }

    //contructor này được tạo ra để phục vụ cho show product
    public Product(String images_url, String erasing_img, String product_name, double product_price, double old_price, String product_description, int product_inventory) {
        super(images_url, erasing_img);
        this.product_name = product_name;
        this.product_price = product_price;
        this.old_price = old_price;
        this.product_description = product_description;
        this.product_inventory = product_inventory;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public double getOld_price() {
        return old_price;
    }

    public void setOld_price(double old_price) {
        this.old_price = old_price;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public int getProduct_type_id() {
        return product_type_id;
    }

    public void setProduct_type_id(int product_type_id) {
        this.product_type_id = product_type_id;
    }

    public int getProduct_inventory() {
        return product_inventory;
    }

    public void setProduct_inventory(int product_inventory) {
        this.product_inventory = product_inventory;
    }
}
