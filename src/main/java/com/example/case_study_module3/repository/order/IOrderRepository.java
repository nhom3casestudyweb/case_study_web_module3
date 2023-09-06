package com.example.case_study_module3.repository.order;

import com.example.case_study_module3.model.order.Order;
import com.example.case_study_module3.model.product.Product;

import java.util.List;
import java.util.Map;

public interface IOrderRepository {
    void insertOrder(Order order);
   Map<Integer, Order> selectAll();
   void updateOrder(Order order);
   Order selectById(int id);
   void deleteOrder(int id);

}
