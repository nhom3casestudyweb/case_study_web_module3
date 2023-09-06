package com.example.case_study_module3.model.product;

public class ProductImages {
    private int product_images_id;
    private String images_url;
    private String erasing_img;

    public ProductImages() {
    }

    public ProductImages(int product_images_id, String images_url, String erasing_img) {
        this.product_images_id = product_images_id;
        this.images_url = images_url;
        this.erasing_img = erasing_img;
    }
    public ProductImages(String images_url, String erasing_img) {
        this.images_url = images_url;
        this.erasing_img = erasing_img;
    }

    public int getProduct_images_id() {
        return product_images_id;
    }

    public void setProduct_images_id(int product_images_id) {
        this.product_images_id = product_images_id;
    }

    public String getImages_url() {
        return images_url;
    }

    public void setImages_url(String images_url) {
        this.images_url = images_url;
    }

    public String getErasing_img() {
        return erasing_img;
    }

    public void setErasing_img(String erasing_img) {
        this.erasing_img = erasing_img;
    }
}
