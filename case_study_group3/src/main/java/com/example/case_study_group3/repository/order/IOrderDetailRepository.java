package com.example.case_study_group3.repository.order;

import com.example.case_study_group3.model.order.OrderDetail;

import java.util.List;

public interface IOrderDetailRepository {
    void insertOrderDetail(OrderDetail orderDetail);
    OrderDetail selectOrderDetail(int OrderId, int productId);
    List<OrderDetail> selectAllOrder();
    void deleteOrderDetail(int OrderId, int productId);
    void updateOrder(int id, OrderDetail orderDetail);


}
