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
        if (action == null){
            action = "";
        }
        switch (action){
            case "showFormCreate":
                break;
            case "showFormUpdate":
                break;
            case "showFormSearch":
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
        }
    }

    private void showListChair(HttpServletRequest request, HttpServletResponse response) {
        List<Product> listChair = productService.showListChair();
        request.setAttribute("listChair",listChair);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showListDesk(HttpServletRequest request, HttpServletResponse response) {
        List<Product> listDesk = productService.showListDesk();
        request.setAttribute("listDesk",listDesk);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showListAccessories(HttpServletRequest request, HttpServletResponse response) {
        List<Product> showListAccessories = productService.showListAccessories();
        request.setAttribute("showListAccessories",showListAccessories);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("");
        try {
            requestDispatcher.forward(request,response);
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

    }
}