package com.example.case_study_module3.model.order;

public class Order {
    private int orderId;
    private String orderDate;
    private int userId;

    public Order(int orderId, String orderDate, int userId) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.userId = userId;
    }

    public Order(String orderDate, int userId) {
        this.orderDate = orderDate;
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
