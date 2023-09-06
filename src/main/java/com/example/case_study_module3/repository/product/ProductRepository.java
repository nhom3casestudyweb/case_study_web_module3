package com.example.case_study_module3.repository.product;

import com.example.case_study_module3.model.product.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String SELECT_PRODUCT_CHAIR = "call show_chair();";
    private static final String SELECT_PRODUCT_DESK = "call show_desk();";
    private static final String SELECT_PRODUCT_ACCESSORIES = "call show_accessories();";
    private static final String SELECT_ALL_PRODUCT = "call show_all_product();";

    private static final String SELECT_PRODUCT_DETAIL = "call show_product_detail(?);";

    @Override
    public List<Product> showListChair() {
        Connection connection = BaseProductRepository.getConnection();
        List<Product> listChair = new ArrayList<>();
        try {
            CallableStatement callableStatement = connection.prepareCall(SELECT_PRODUCT_CHAIR);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                int productId = resultSet.getInt("product_id");
                String productName = resultSet.getString("product_name");
                double productPrice = resultSet.getDouble("product_price");
                double oldPrice = resultSet.getDouble("old_price");
                String productDescription = resultSet.getString("product_description");
                int productInventory = resultSet.getInt("product_inventory");
                String imagesUrl = resultSet.getString("images_url");
                String erasingImg = resultSet.getString("erasing_img");
                listChair.add(new Product(imagesUrl, erasingImg, productId, productName, productPrice, oldPrice, productDescription, productInventory));
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
            CallableStatement callableStatement = connection.prepareCall(SELECT_PRODUCT_DESK);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                int productId = resultSet.getInt("product_id");
                String productName = resultSet.getString("product_name");
                double productPrice = resultSet.getDouble("product_price");
                double oldPrice = resultSet.getDouble("old_price");
                String productDescription = resultSet.getString("product_description");
                int productInventory = resultSet.getInt("product_inventory");
                String imagesUrl = resultSet.getString("images_url");
                String erasingImg = resultSet.getString("erasing_img");
                listDesk.add(new Product(imagesUrl, erasingImg, productId, productName, productPrice, oldPrice, productDescription, productInventory));
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
            CallableStatement callableStatement = connection.prepareCall(SELECT_PRODUCT_ACCESSORIES);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                int productId = resultSet.getInt("product_id");
                String productName = resultSet.getString("product_name");
                double productPrice = resultSet.getDouble("product_price");
                double oldPrice = resultSet.getDouble("old_price");
                String productDescription = resultSet.getString("product_description");
                int productInventory = resultSet.getInt("product_inventory");
                String imagesUrl = resultSet.getString("images_url");
                String erasingImg = resultSet.getString("erasing_img");
                listAccessories.add(new Product(imagesUrl, erasingImg, productId, productName, productPrice, oldPrice, productDescription, productInventory));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listAccessories;
    }

    @Override
    public Product finById(int productId) {
        Product product = null;
        Connection connection = BaseProductRepository.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_PRODUCT);
            while (resultSet.next()) {
                if (resultSet.getInt("product_id") == productId) {
                    String productName = resultSet.getString("product_name");
                    double productPrice = resultSet.getDouble("product_price");
                    double oldPrice = resultSet.getDouble("old_price");
                    String productDescription = resultSet.getString("product_description");
                    int productInventory = resultSet.getInt("product_inventory");
                    String imagesUrl = resultSet.getString("images_url");
                    String erasingImg = resultSet.getString("erasing_img");
                    product = new Product(imagesUrl, erasingImg, productId, productName, productPrice, oldPrice, productDescription, productInventory);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }
}
