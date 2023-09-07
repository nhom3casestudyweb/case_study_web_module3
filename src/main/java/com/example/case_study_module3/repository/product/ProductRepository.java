package com.example.case_study_module3.repository.product;

import com.example.case_study_module3.model.product.Product;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String INSERT_PRODUCT_CHAIR = "call insert_chair();";
    private static final String INSERT_PRODUCT_DESK = "call insert_desk();";
    private static final String INSERT_PRODUCT_ACCESSORIES = "call insert_accessories();";
    private static final String INSERT_PRODUCT = "call case_study_web_group3.show_product()";
    private static final String DELETE_PRODUCT = "call case_study_web_group3.delete_product(?)";
    private static final String EDIT_PRODUCT = "call case_study_web_group3.edit_product(?)";
    private static final String EDIT_PRODUCTS = "call case_study_web_group3.edit_products(?,?,?,?,?)";
    private static final String CREATE_PRODUCT = "call case_study_web_group3.create_product(?,?,?,?,?)";
    @Override
    public List<Product> showListChair() {
        Connection connection = BaseProductRepository.getConnection();
        List<Product> listChair = new ArrayList<>();
        try {
            CallableStatement callableStatement = connection.prepareCall(INSERT_PRODUCT_CHAIR);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                int product_id = resultSet.getInt("product_id");
                String product_name = resultSet.getString("product_name");
                double product_price = resultSet.getDouble("product_price");
                String product_description = resultSet.getString("product_description");
                int product_type_id = resultSet.getInt("product_type_id");
                int product_inventory = resultSet.getInt("product_inventory");
                listChair.add(new Product(product_id, product_name, product_price, product_description, product_type_id, product_inventory));
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
                int product_id = resultSet.getInt("product_id");
                String product_name = resultSet.getString("product_name");
                double product_price = resultSet.getDouble("product_price");
                String product_description = resultSet.getString("product_description");
                int product_type_id = resultSet.getInt("product_type_id");
                int product_inventory = resultSet.getInt("product_inventory");
                listDesk.add(new Product(product_id, product_name, product_price, product_description, product_type_id, product_inventory));
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
                int product_id = resultSet.getInt("product_id");
                String product_name = resultSet.getString("product_name");
                double product_price = resultSet.getDouble("product_price");
                String product_description = resultSet.getString("product_description");
                int product_type_id = resultSet.getInt("product_type_id");
                int product_inventory = resultSet.getInt("product_inventory");
                listAccessories.add(new Product(product_id, product_name, product_price, product_description, product_type_id, product_inventory));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listAccessories;
    }

    @Override
    public List<Product> showListProduct() {
        List<Product> productList = new ArrayList<>();
        try {
            CallableStatement callableStatement = BaseProductRepository.getConnection().prepareCall(INSERT_PRODUCT);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                int product_id = resultSet.getInt("product_id");
                String product_name = resultSet.getString("product_name");
                double product_price = resultSet.getDouble("product_price");
                String product_description = resultSet.getString("product_description");
                int product_type_id = resultSet.getInt("product_type_id");
                int product_inventory = resultSet.getInt("product_inventory");
                productList.add(new Product(product_id,product_name,product_price,product_description,product_type_id,product_inventory));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }

    @Override
    public void deleteProduct(int id) {
        try {
            CallableStatement callableStatement = BaseProductRepository.getConnection().prepareCall(DELETE_PRODUCT);
            callableStatement.setInt(1,id);
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Product editProduct(int idProduct) {
        Product product = new Product();
        try {
            CallableStatement callableStatement = BaseProductRepository.getConnection().prepareCall(EDIT_PRODUCT);
            callableStatement.setInt(1,idProduct);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()){
                int product_id = resultSet.getInt("product.product_id");
                String product_name = resultSet.getString("product.product_name");
                double product_price = resultSet.getDouble("product.product_price");
                String product_description = resultSet.getString("product.product_description");
                int product_type_id = resultSet.getInt("product.product_type_id");
                int product_inventory = resultSet.getInt("product.product_inventory");
                String images_url = resultSet.getString("product_images.images_url");
                product = new Product(product_id,product_name,product_price,product_description,product_type_id,product_inventory,images_url);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }

    @Override
    public void editProducts(int productId, String productNam, double productPrice, int productType, int productInventory) {
        try {
            CallableStatement callableStatement = BaseProductRepository.getConnection().prepareCall(EDIT_PRODUCTS);
            callableStatement.setInt(1,productId);
            callableStatement.setString(2,productNam);
            callableStatement.setDouble(3,productPrice);
            callableStatement.setInt(4,productType);
            callableStatement.setInt(5,productInventory);
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void createProduct(String productName, int productPrice, String productDescription, int productType, int productInventory) {
        try {
            CallableStatement callableStatement = BaseProductRepository.getConnection().prepareCall(CREATE_PRODUCT);
            callableStatement.setString(1,productName);
            callableStatement.setInt(2,productPrice);
            callableStatement.setString(3,productDescription);
            callableStatement.setInt(4,productType);
            callableStatement.setInt(5,productInventory);
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
