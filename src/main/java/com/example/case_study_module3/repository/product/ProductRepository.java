package com.example.case_study_module3.repository.product;

import com.example.case_study_module3.model.product.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
<<<<<<< HEAD
    private static final String INSERT_PRODUCT_CHAIR = "call insert_chair();";
    private static final String INSERT_PRODUCT_DESK = "call insert_desk();";
    private static final String INSERT_PRODUCT_ACCESSORIES = "call insert_accessories();";
    private static final String INSERT_PRODUCT = "call case_study_web_group3.show_product()";
    private static final String DELETE_PRODUCT = "call case_study_web_group3.delete_product(?)";
    private static final String EDIT_PRODUCT = "call case_study_web_group3.edit_product(?)";
    private static final String EDIT_PRODUCTS = "call case_study_web_group3.edit_products(?,?,?,?,?)";
    private static final String CREATE_PRODUCT = "call case_study_web_group3.create_product(?,?,?,?,?)";
=======
    private static final String SELECT_PRODUCT_CHAIR = "call show_chair();";
    private static final String SELECT_PRODUCT_DESK = "call show_desk();";
    private static final String SELECT_PRODUCT_ACCESSORIES = "call show_accessories();";
    private static final String SELECT_ALL_PRODUCT = "call show_all_product();";

    private static final String SELECT_PRODUCT_DETAIL = "call show_product_detail(?);";
//    private static final String FIND_PRODUCT_BY_NAME =

>>>>>>> 3131d05c12dbcceb7faf0be23fba715278f7b32a
    @Override
    public List<Product> showListChair() {
        Connection connection = BaseProductRepository.getConnection();
        List<Product> listChair = new ArrayList<>();
        try {
            CallableStatement callableStatement = connection.prepareCall(SELECT_PRODUCT_CHAIR);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
<<<<<<< HEAD
                int product_id = resultSet.getInt("product_id");
                String product_name = resultSet.getString("product_name");
                double product_price = resultSet.getDouble("product_price");
                String product_description = resultSet.getString("product_description");
                int product_type_id = resultSet.getInt("product_type_id");
                int product_inventory = resultSet.getInt("product_inventory");
                listChair.add(new Product(product_id, product_name, product_price, product_description, product_type_id, product_inventory));
=======
                int productId = resultSet.getInt("product_id");
                String productName = resultSet.getString("product_name");
                double productPrice = resultSet.getDouble("product_price");
                double oldPrice = resultSet.getDouble("old_price");
                String productDescription = resultSet.getString("product_description");
                int productInventory = resultSet.getInt("product_inventory");
                String imagesUrl = resultSet.getString("images_url");
                String erasingImg = resultSet.getString("erasing_img");
                listChair.add(new Product(imagesUrl, erasingImg, productId, productName, productPrice, oldPrice, productDescription, productInventory));
>>>>>>> 3131d05c12dbcceb7faf0be23fba715278f7b32a
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
<<<<<<< HEAD
                int product_id = resultSet.getInt("product_id");
                String product_name = resultSet.getString("product_name");
                double product_price = resultSet.getDouble("product_price");
                String product_description = resultSet.getString("product_description");
                int product_type_id = resultSet.getInt("product_type_id");
                int product_inventory = resultSet.getInt("product_inventory");
                listDesk.add(new Product(product_id, product_name, product_price, product_description, product_type_id, product_inventory));
=======
                int productId = resultSet.getInt("product_id");
                String productName = resultSet.getString("product_name");
                double productPrice = resultSet.getDouble("product_price");
                double oldPrice = resultSet.getDouble("old_price");
                String productDescription = resultSet.getString("product_description");
                int productInventory = resultSet.getInt("product_inventory");
                String imagesUrl = resultSet.getString("images_url");
                String erasingImg = resultSet.getString("erasing_img");
                listDesk.add(new Product(imagesUrl, erasingImg, productId, productName, productPrice, oldPrice, productDescription, productInventory));
>>>>>>> 3131d05c12dbcceb7faf0be23fba715278f7b32a
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
<<<<<<< HEAD
                int product_id = resultSet.getInt("product_id");
                String product_name = resultSet.getString("product_name");
                double product_price = resultSet.getDouble("product_price");
                String product_description = resultSet.getString("product_description");
                int product_type_id = resultSet.getInt("product_type_id");
                int product_inventory = resultSet.getInt("product_inventory");
                listAccessories.add(new Product(product_id, product_name, product_price, product_description, product_type_id, product_inventory));
=======
                int productId = resultSet.getInt("product_id");
                String productName = resultSet.getString("product_name");
                double productPrice = resultSet.getDouble("product_price");
                double oldPrice = resultSet.getDouble("old_price");
                String productDescription = resultSet.getString("product_description");
                int productInventory = resultSet.getInt("product_inventory");
                String imagesUrl = resultSet.getString("images_url");
                String erasingImg = resultSet.getString("erasing_img");
                listAccessories.add(new Product(imagesUrl, erasingImg, productId, productName, productPrice, oldPrice, productDescription, productInventory));
>>>>>>> 3131d05c12dbcceb7faf0be23fba715278f7b32a
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listAccessories;
    }

    @Override
<<<<<<< HEAD
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
=======
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
>>>>>>> 3131d05c12dbcceb7faf0be23fba715278f7b32a
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }

    @Override
<<<<<<< HEAD
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
=======
    public List<Product> findByName(String searchName) {
        Connection connection = BaseProductRepository.getConnection();
        List<Product> productList = new ArrayList<>();
        try {
            CallableStatement callableStatement = connection.prepareCall(SELECT_ALL_PRODUCT);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()){
                if (resultSet.getString("product_name").contains(searchName)){
                    int productId = resultSet.getInt("product_id");
                    String productName = resultSet.getString("product_name");
                    double productPrice = resultSet.getDouble("product_price");
                    double oldPrice = resultSet.getDouble("old_price");
                    String productDescription = resultSet.getString("product_description");
                    int productInventory = resultSet.getInt("product_inventory");
                    String imagesUrl = resultSet.getString("images_url");
                    String erasingImg = resultSet.getString("erasing_img");
                    productList.add(new Product(imagesUrl, erasingImg, productId, productName, productPrice, oldPrice, productDescription, productInventory));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productList;
>>>>>>> 3131d05c12dbcceb7faf0be23fba715278f7b32a
    }
}
