package com.example.case_study_group3.repository.product;

import com.example.case_study_group3.model.product.ProductImages;
import com.example.case_study_group3.repository.BaseOrderRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductImagesRepository implements  IProductImagesRepository{
    private static final String INSERT_IMAGES = "INSERT INTO product_images(images_url,product_id)" +
            "values(?,?);";
    private static final String SELECT_BY_PRODUCT_ID = "SELECT * FROM product_images WHERE product_id = ?;";
    private static final String UPDATE_IMAGES = "UPDATE product_images set images_url = ? WHERE images_id = ?;";
    private static final String DELETE_IMAGES = "DELETE FROM product_images WHERE images_id = ?;";
    private static final String DELETE_BY_PRODUCT_ID = "DELETE FROM product_images WHERE product_id = ?;";

    @Override
    public void insertImages(ProductImages productImages) {
        Connection connection = BaseOrderRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_IMAGES);
            preparedStatement.setString(1,productImages.getUrl());
            preparedStatement.setInt(2,productImages.getProduct().getId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateImages(int id, ProductImages productImages) {
        Connection connection = BaseOrderRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_IMAGES);
            preparedStatement.setString(1,productImages.getUrl());
            preparedStatement.setInt(2,id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<ProductImages> searchImagesByProduct(int id) {
        List<ProductImages> productImages = new ArrayList<>();
        Connection connection = BaseOrderRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_PRODUCT_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int idImages = resultSet.getInt("product_images_id");
                String imagesUrl = resultSet.getString("images_url");
                productImages.add(new ProductImages(idImages,imagesUrl));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productImages;
    }

    @Override
    public void deleteImages(int id) {
        Connection connection = BaseOrderRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_IMAGES);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void deleteImagesById(int id) {
        Connection connection = BaseOrderRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_PRODUCT_ID);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
