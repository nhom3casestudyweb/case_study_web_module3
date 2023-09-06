package com.example.case_study_module3.repository.product;

import com.example.case_study_module3.model.product.Product;
import com.example.case_study_module3.repository.BaseRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String INSERT_PRODUCT_CHAIR = "call show_chair();";
    private static final String INSERT_PRODUCT_CHAIR_DETAIL = "call show_chair_detail(?);";
    private static final String INSERT_PRODUCT_DESK = "call show_desk();";
    private static final String INSERT_PRODUCT_ACCESSORIES = "call show_accessories();";
    private static final String SELECT_BY_ID = "SELECT * FROM product WHERE product_id = ?;";

    @Override
    public List<Product> showListChair() {
        Connection connection = BaseProductRepository.getConnection();
        List<Product> listChair = new ArrayList<>();
        try {
            CallableStatement callableStatement = connection.prepareCall(INSERT_PRODUCT_CHAIR);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                String product_name = resultSet.getString("product_name");
                double product_price = resultSet.getDouble("product_price");
                double old_price = resultSet.getDouble("old_price");
                String product_description = resultSet.getString("product_description");
                int product_inventory = resultSet.getInt("product_inventory");
                String images_url = resultSet.getString("images_url");
                String erasing_img = resultSet.getString("erasing_img");
                listChair.add(new Product(images_url, erasing_img, product_name, product_price, old_price, product_description, product_inventory));
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
            while (resultSet.next()) {
                String product_name = resultSet.getString("product_name");
                double product_price = resultSet.getDouble("product_price");
                double old_price = resultSet.getDouble("old_price");
                String product_description = resultSet.getString("product_description");
                int product_inventory = resultSet.getInt("product_inventory");
                String images_url = resultSet.getString("images_url");
                String erasing_img = resultSet.getString("erasing_img");
                listDesk.add(new Product(images_url, erasing_img, product_name, product_price, old_price, product_description, product_inventory));
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
            while (resultSet.next()) {
                String product_name = resultSet.getString("product_name");
                double product_price = resultSet.getDouble("product_price");
                double old_price = resultSet.getDouble("old_price");
                String product_description = resultSet.getString("product_description");
                int product_inventory = resultSet.getInt("product_inventory");
                String images_url = resultSet.getString("images_url");
                String erasing_img = resultSet.getString("erasing_img");
                listAccessories.add(new Product(images_url, erasing_img, product_name, product_price, old_price, product_description, product_inventory));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listAccessories;
    }

    @Override
    public Product selectProduct(int id) {
        Product product = null;
        Connection connection = null;
        try {
            connection = BaseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String productName = resultSet.getString("product_name");
                int price = resultSet.getInt("product_price");
                String description = resultSet.getString("product_description");
                int productType = resultSet.getInt("product_type_id");
                int productInventory = resultSet.getInt("product_inventory");
                product = new Product(productName, price, description, productType, productInventory);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }
}

