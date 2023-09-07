package com.example.case_study_module3.controller.product;

import com.example.case_study_module3.model.product.Product;
import com.example.case_study_module3.service.product.IProductService;
import com.example.case_study_module3.service.product.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product-servlet")
public class ProductServlet extends HttpServlet {
    private IProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
<<<<<<< HEAD
        switch (action){
            case "editProduct" :
                editProduct(request,response);
=======
        switch (action) {
            case "showFormCreate":
>>>>>>> 3131d05c12dbcceb7faf0be23fba715278f7b32a
                break;
            case "showFormUpdate":
                break;
            case "showFormSearch":
                showFormSearch(request,response);
                break;
            case "showListChair":
                showListChair(request, response);
                break;
            case "showListDesk":
                showListDesk(request, response);
                break;
            case "showListAccessories":
                showListAccessories(request, response);
                break;
<<<<<<< HEAD
            default:
                showFormCreate(request,response);
                break;
        }
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) {
        int idProduct = Integer.parseInt(request.getParameter("code"));
        Product product = productService.editProduct(idProduct);
        request.setAttribute("product",product);
=======
            case "showProductDetail":
                showProductDetail(request, response);
                break;
            default:
        }
    }

    private void showFormSearch(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/form_search_jsp");
>>>>>>> 3131d05c12dbcceb7faf0be23fba715278f7b32a
        try {
            request.getRequestDispatcher("form_edit_product.jsp").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = productService.showListProduct();
        request.setAttribute("productList",productList);
        try {
            request.getRequestDispatcher("adimin_product.jsp").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showProductDetail(HttpServletRequest request, HttpServletResponse response) {
        int productId = Integer.parseInt(request.getParameter("productId"));
        Product product = productService.finById(productId);
        request.setAttribute("product", product);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/productdetails.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showListChair(HttpServletRequest request, HttpServletResponse response) {
        List<Product> listChair = productService.showListChair();
<<<<<<< HEAD
        request.setAttribute("listChair",listChair);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product.jsp");
=======
        request.setAttribute("listChair", listChair);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product_chair.jsp");
>>>>>>> 3131d05c12dbcceb7faf0be23fba715278f7b32a
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showListDesk(HttpServletRequest request, HttpServletResponse response) {
        List<Product> listDesk = productService.showListDesk();
<<<<<<< HEAD
        request.setAttribute("listDesk",listDesk);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("");
=======
        request.setAttribute("listDesk", listDesk);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product_desk.jsp");
>>>>>>> 3131d05c12dbcceb7faf0be23fba715278f7b32a
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showListAccessories(HttpServletRequest request, HttpServletResponse response) {
<<<<<<< HEAD
        List<Product> showListAccessories = productService.showListAccessories();
        request.setAttribute("showListAccessories",showListAccessories);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("");
=======
        List<Product> listAccessories = productService.showListAccessories();
        request.setAttribute("listAccessories", listAccessories);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product_accessories.jsp");
>>>>>>> 3131d05c12dbcceb7faf0be23fba715278f7b32a
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
<<<<<<< HEAD
            case "deleteProduct":
                deleteProduct(request,response);
                break;
            case "editProduct" :
                editProducts(request,response);
                break;
            case "createProduct" :
                createProduct(request,response);
                break;
        }
=======
            case "search":
                searchByName(request,response);
        }
    }
>>>>>>> 3131d05c12dbcceb7faf0be23fba715278f7b32a

    private void searchByName(HttpServletRequest request, HttpServletResponse response) {
        String productName = request.getParameter("product_name");
        List<Product> productList = productService.findByName(productName);
        request.setAttribute("productList",productList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/form_search_product.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        String product_name = request.getParameter("product_name");
        int product_price = Integer.parseInt(request.getParameter("product_price"));
        String product_description = request.getParameter("product_description");
        int product_type = Integer.parseInt(request.getParameter("product_type"));
        int product_inventory = Integer.parseInt(request.getParameter("product_inventory"));
        productService.createProduct(product_name,product_price,product_description,product_type,product_inventory);
        try {
            response.sendRedirect("/product-servlet");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int a = 0;
    }

    private void editProducts(HttpServletRequest request, HttpServletResponse response) {
        int productId = Integer.parseInt(request.getParameter("code"));
        String productNam = request.getParameter("product_name");
        double productPrice = Double.parseDouble(request.getParameter("price"));
        int productType = Integer.parseInt(request.getParameter("product_type"));
        int productInventory = Integer.parseInt(request.getParameter("product_inventory"));
        productService.editProducts(productId,productNam,productPrice,productType,productInventory);
        try {
            response.sendRedirect("/product-servlet");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        productService.deleteProduct(id);
        try {
            response.sendRedirect("/product-servlet");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}