package com.example.case_study_group3.repository.order;

import com.example.case_study_group3.model.order.Order;
import com.example.case_study_group3.repository.BaseOrderRepository;

import java.sql.*;
import java.util.Map;

public class OrderRepository implements IOrderRepository {
    private static final String INSERT_ORDER = "INSERT INTO order_detail(order_date,user_id,payment_status)" +
            "values(?,?,?);";
    private static final String SELECT_ALL = "SELECT * FROM order";
    private static final String SELECT_ORDER = "SELECT * FROM order where order_id= ?;";
    private static final String DELETE = "DELETE FROM order where order_id = ?;";
    private static final String UPDATE = "UPDATE order set " +
            "payment_date = ?," +
            "payment_status= ?," +
            "where card_id= ?;";

    @Override
    public void insertOrder(Order order) {
        Connection connection = BaseOrderRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ORDER);
            preparedStatement.setString(1,order.getOrderDate());
            preparedStatement.setInt(2,order.getUserId());
            preparedStatement.setInt(3,order.getPaymentStatus());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Order selectOrder(int id) {
        Order order = null;
        Connection connection = BaseOrderRepository.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ORDER);
            while (resultSet.next()){

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Map<Integer, Order> selectAllOrder() {
        return null;
    }

    @Override
    public void deleteOrder() {

    }

    @Override
    public void updateOrder() {

    }
}
