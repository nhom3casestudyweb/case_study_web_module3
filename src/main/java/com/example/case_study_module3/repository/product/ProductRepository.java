package com.example.case_study_module3.repository.product;

import com.example.case_study_module3.model.product.Product;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private static final String INSERT_PRODUCT_CHAIR = "call insert_chair();";
    private static final String INSERT_PRODUCT_DESK = "call insert_desk();";
    private static final String INSERT_PRODUCT_ACCESSORIES = "call insert_accessories();";
    @Override
    public List<Product> showListChair() {
        Connection connection = BaseProductRepository.getConnection();
        List<Product> listChair = new ArrayList<>();
        try {
            CallableStatement callableStatement = connection.prepareCall(INSERT_PRODUCT_CHAIR);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()){
                int product_id = resultSet.getInt("product_id");
                String product_name = resultSet.getString("product_name");
                double product_price = resultSet.getDouble("product_price");
                String product_description = resultSet.getString("product_description");
                int product_type_id = resultSet.getInt("product_type_id");
                int product_inventory = resultSet.getInt("product_inventory");
                listChair.add(new Product(product_id,product_name,product_price,product_description,product_type_id,product_inventory));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listChair;
    }

    @Override
    public List<Product> showListDesk() {
        Connection connection = BaseProductRepository.getConnection();
        List<Product> listDesk = new ArrayList<>();
        try {
            CallableStatement callableStatement = connection.prepareCall(INSERT_PRODUCT_DESK);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()){
                int product_id = resultSet.getInt("product_id");
                String product_name = resultSet.getString("product_name");
                double product_price = resultSet.getDouble("product_price");
                String product_description = resultSet.getString("product_description");
                int product_type_id = resultSet.getInt("product_type_id");
                int product_inventory = resultSet.getInt("product_inventory");
                listDesk.add(new Product(product_id,product_name,product_price,product_description,product_type_id,product_inventory));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listDesk;
    }

    @Override
    public List<Product> showListAccessories() {
        Connection connection = BaseProductRepository.getConnection();
        List<Product> listAccessories = new ArrayList<>();
        try {
            CallableStatement callableStatement = connection.prepareCall(INSERT_PRODUCT_ACCESSORIES);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()){
                int product_id = resultSet.getInt("product_id");
                String product_name = resultSet.getString("product_name");
                double product_price = resultSet.getDouble("product_price");
                String product_description = resultSet.getString("product_description");
                int product_type_id = resultSet.getInt("product_type_id");
                int product_inventory = resultSet.getInt("product_inventory");
                listAccessories.add(new Product(product_id,product_name,product_price,product_description,product_type_id,product_inventory));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listAccessories;
    }
}
