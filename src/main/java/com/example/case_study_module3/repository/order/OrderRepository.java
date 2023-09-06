package com.example.case_study_module3.repository.order;

import com.example.case_study_module3.model.order.Order;
import com.example.case_study_module3.model.product.Product;
import com.example.case_study_module3.repository.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepository implements IOrderRepository {
    private static final String INSERT_ORDER = "INSERT INTO order(order_date,user_id)" +
            "values(?,?);";
    private static final String SHOW_ALL = "SELECT * FROM order;";
    private static final String DELETE = "DELETE FROM order WHERE order_id = ?;";
    private static final String SELECT_BY_ID = "SELECT * FROM order WHERE order_id = ?;";


    @Override
    public void insertOrder(Order order) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ORDER);
            preparedStatement.setString(1,order.getOrderDate());
            preparedStatement.setInt(2,order.getUserId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Map<Integer, Order> selectAll() {
        Map<Integer, Order> orderMap = new HashMap<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SHOW_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int orderId = resultSet.getInt("order_id");
                String orderDate = resultSet.getString("order_date");
                int userId = resultSet.getInt("user_id");
                orderMap.put(orderId,new Order(orderId,orderDate,userId));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return orderMap;
    }

    @Override
    public void updateOrder(Order order) {

    }

    @Override
    public Order selectById(int id) {
        Order order = null;
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int orderId = resultSet.getInt("order_id");
                String orderDate = resultSet.getString("order_date");
                int userId = resultSet.getInt("user_id");
                order = new Order(orderId,orderDate,userId);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return order;
    }

    @Override
    public void deleteOrder(int id) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
