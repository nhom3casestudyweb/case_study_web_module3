package com.example.case_study_group3.repository.order;

import com.example.case_study_group3.model.order.Order;

import java.util.Map;

public interface IOrderRepository {
    void insertOrder(Order order);
    Order selectOrder(int id);
    Map<Integer,Order> selectAllOrder();

    void deleteOrder();
    void updateOrder();

}
