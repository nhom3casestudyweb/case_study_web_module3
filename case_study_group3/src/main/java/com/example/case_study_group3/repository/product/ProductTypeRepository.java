package com.example.case_study_group3.repository.product;

import com.example.case_study_group3.model.product.ProductType;
import com.example.case_study_group3.repository.BaseOrderRepository;
import com.sun.corba.se.pept.transport.ConnectionCache;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class ProductTypeRepository implements IProductTypeRepository {
    private static final String SELECT_PRODUCT_TYPE_BY_ID = "SELECT * FROM product_type WHERE product_type_id = ?;";
    private static final String SELECT_PRODUCT_TYPE = "SELECT * FROM product_type;";
    @Override
    public ProductType selectProductType(int id) {
        ProductType productType = null;
        Connection connection = BaseOrderRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_TYPE_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("product_type_name");
                productType = new ProductType(id,name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return productType;
    }

    @Override
    public Map<Integer, ProductType> selectAllProductType() {
        Map<Integer, ProductType> productTypeMap = new HashMap<>();
        Connection connection = BaseOrderRepository.getConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_PRODUCT_TYPE);
            while (resultSet.next()){
                int id = resultSet.getInt("product_type_id");
                String name = resultSet.getString("product_type_name");
                productTypeMap.put(id,new ProductType(id,name));
            }
            resultSet.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productTypeMap;
    }
}
