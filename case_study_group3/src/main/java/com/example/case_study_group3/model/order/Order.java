package com.example.case_study_group3.model.order;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class Order {
    private  int orderId;
    private String orderDate;
    private int userId;

    private Map<Integer,OrderDetail> detailList;
    private int paymentStatus;
    private String paymentDate;

    public Order(int orderId, String orderDate, int userId, Map<Integer, OrderDetail> detailList, int paymentStatus, String paymentDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.userId = userId;
        this.detailList = detailList;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
    }

    public Order(String orderDate, int userId, Map<Integer, OrderDetail> detailList, int paymentStatus, String paymentDate) {
        this.orderDate = orderDate;
        this.userId = userId;
        this.detailList = detailList;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
    }

    public Order( int userId) {
        this.orderDate =String.valueOf(LocalDate.now());
        this.userId = userId;
        this.paymentStatus = 0;
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

    public Map<Integer, OrderDetail> getDetailList() {
        return detailList;
    }

    public void setDetailList(Map<Integer, OrderDetail> detailList) {
        this.detailList = detailList;
    }

    public int getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
}
