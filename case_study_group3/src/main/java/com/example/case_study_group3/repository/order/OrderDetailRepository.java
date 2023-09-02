package com.example.case_study_group3.repository.order;

import com.example.case_study_group3.model.order.OrderDetail;
import com.example.case_study_group3.repository.BaseOrderRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailRepository implements IOrderDetailRepository {
    private static final String INSERT_ORDER_DETAIL = "INSERT INTO order_detail(order_id, product_id,order_detail_price,product_quantity)" +
            "values(?,?,?,?);";
    private static final String SELECT_BY_PRODUCT_ID = "SELECT * FROM order_detail WHERE product_id = ?;";
    private static final String SELECT_ALL = "SELECT * FROM order_detail;";
    private static final String DElETE = "DELETE FROM order_detail WHERE product_id =? , order = ?;";
    private static final String UPDATE = "UPDATE order_detail SET " +
            "order_detail_price =?," +
            "product_quantity = ?," +
            "WHERE product_id = ? AND order_id = ?;";
    @Override
    public void insertOrderDetail(OrderDetail orderDetail) {
        Connection connection = BaseOrderRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ORDER_DETAIL);
            preparedStatement.setInt(1,orderDetail.getOrderId());
            preparedStatement.setInt(2,orderDetail.getProductId());
            preparedStatement.setInt(3,orderDetail.getPrice());
            preparedStatement.setInt(4,orderDetail.getQuantity());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public OrderDetail selectOrderDetail(int OrderId, int productId) {

    }

    @Override
    public List<OrderDetail> selectAllOrder() {
        List<OrderDetail> orderDetailList = new ArrayList<>();
        Connection connection = BaseOrderRepository.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL);
            while (resultSet.next()){

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void deleteOrderDetail(int OrderId, int productId) {

    }

    @Override
    public void updateOrder(int id, OrderDetail orderDetail) {

    }
}
