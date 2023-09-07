package com.example.case_study_module3.model.product;

<<<<<<< HEAD
public class Product {
    private int product_id;
    private String product_name;
    private double product_price;
    private String product_description;
    private int product_type_id;
    private int product_inventory;
    private String images_url;
=======
public class Product extends ProductImages {
    private int productId;
    private String productName;
    private double productPrice;
    private double oldPrice;
    private String productDescription;
    private int productTypeId;
    private int productInventory;
>>>>>>> 3131d05c12dbcceb7faf0be23fba715278f7b32a

    public Product() {
    }

<<<<<<< HEAD
    public Product(int product_id, String product_name, double product_price, String product_description, int product_type_id, int product_inventory, String images_url) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_description = product_description;
        this.product_type_id = product_type_id;
        this.product_inventory = product_inventory;
        this.images_url = images_url;
    }

    public Product(String product_name, double product_price, String product_description, int product_type_id, int product_inventory) {
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_description = product_description;
        this.product_type_id = product_type_id;
        this.product_inventory = product_inventory;
    }

    public Product(int product_id, String product_name, double product_price, String product_description, int product_type_id, int product_inventory) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_description = product_description;
        this.product_type_id = product_type_id;
        this.product_inventory = product_inventory;
    }

    public String getImages_url() {
        return images_url;
    }

    public void setImages_url(String images_url) {
        this.images_url = images_url;
=======
    public Product(String productName, double productPrice, String productDescription, int productTypeId, int productInventory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productTypeId = productTypeId;
        this.productInventory = productInventory;
    }

    public Product(int productId, String productName, double productPrice, double oldPrice, String productDescription, int productTypeId, int productInventory) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.oldPrice = oldPrice;
        this.productDescription = productDescription;
        this.productTypeId = productTypeId;
        this.productInventory = productInventory;
    }

    public Product(int productImagesId, String imagesUrl, String erasingImg, int productId, String productName, double productPrice, double oldPrice, String productDescription, int productTypeId, int productInventory) {
        super(productImagesId, imagesUrl, erasingImg);
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.oldPrice = oldPrice;
        this.productDescription = productDescription;
        this.productTypeId = productTypeId;
        this.productInventory = productInventory;
    }

    //contructor này được tạo ra để phục vụ cho show product
    public Product(String imagesUrl, String erasingImg, int productId, String productName, double productPrice, double oldPrice, String productDescription, int productInventory) {
        super(imagesUrl, erasingImg);
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.oldPrice = oldPrice;
        this.productDescription = productDescription;
        this.productInventory = productInventory;
>>>>>>> 3131d05c12dbcceb7faf0be23fba715278f7b32a
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

<<<<<<< HEAD
    public String getProduct_description() {
        return product_description;
=======
    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getProductDescription() {
        return productDescription;
>>>>>>> 3131d05c12dbcceb7faf0be23fba715278f7b32a
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    public int getProductInventory() {
        return productInventory;
    }

    public void setProductInventory(int productInventory) {
        this.productInventory = productInventory;
    }
}
