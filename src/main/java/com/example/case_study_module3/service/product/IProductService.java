package com.example.case_study_module3.service.product;

import com.example.case_study_module3.model.product.Product;

import java.util.List;

//package com.example.case_study_group3.service.product;
public interface IProductService {
    List<Product> showListChair();
    List<Product> showListDesk();
    List<Product> showListAccessories();
<<<<<<< HEAD

    List<Product> showListProduct();

    void deleteProduct(int id);

    Product editProduct(int idProduct);

    void editProducts(int productId, String productNam, double productPrice, int productType, int productInventory);

    void createProduct(String productName, int productPrice, String productDescription, int productType, int productInventory);
=======
    Product finById(int productId);
    List<Product> findByName(String searchName);
>>>>>>> 3131d05c12dbcceb7faf0be23fba715278f7b32a
}
