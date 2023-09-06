package com.example.case_study_module3.model.order;

import com.example.case_study_module3.model.product.Product;

public class OrderDetail {
    private int OrderId;
    private Product product;
    private int price;
    private int quantity;

    public OrderDetail(int orderId, Product product, int price, int quantity) {
        OrderId = orderId;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
