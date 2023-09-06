package com.example.account.service.customer;

import com.example.account.model.customer.Customer;
import com.example.account.repository.customer.CustomerRepository;
import com.example.account.repository.customer.ICustomerRepository;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService{
    ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> selectAllCustomer() throws SQLException {
        return customerRepository.selectAllUser();
    }

    @Override
    public Customer selectCustomer(int id) throws SQLException {
        return customerRepository.selectCustomer(id);
    }

    @Override
    public boolean removeUser(int id) throws SQLException {
        return customerRepository.deleteUser(id);
    }

    @Override
    public Map<String, String> save(Customer customer) {
        Map<String, String> errMap = new HashMap<>();
        if (customer.getName().trim().equals("") || customer.getName() == null){
            errMap.put("errName","Tên không được để trống");
        } else if (customer.getName().equals("admin")) {
            errMap.put("errname","Không đặt tên admin");
        } else if (customer.getName().length() > 255) {
            errMap.put("errName","Tên không được vượt quá 255 kí tự");
        }
        if (customer.getIdCard().trim().equals("") || customer.getIdCard() == null) {
            errMap.put("errIdCard", "Không Để Trống ID_Card");
        } else if (customer.getIdCard().length() > 20) {
            errMap.put("errIdCard", "IdCard Vượt Quá 20 Kí Tự");

        }
        if (customer.getPhoneNumber().trim().equals("") || customer.getPhoneNumber() == null) {
            errMap.put("errPhoneNumber", "Không Để Trống Phone Number");
        } else if (customer.getPhoneNumber().length() > 20) {
            errMap.put("errPhoneNumber", "NumberPhone Vượt Quá 20 Kí Tự");

        }
        if (customer.getEmail().trim().equals("") || customer.getEmail() == null) {
            errMap.put("errEmail", "Không Để Trống Email");
        } else if (customer.getEmail().length() > 55) {
            errMap.put("errEmail", "Email Vượt Quá 55 Kí Tự");
        }
        if (customer.getAddress().trim().equals("") || customer.getAddress() == null) {
            errMap.put("errAddress", "Không Để Trống Address");
        } else if (customer.getAddress().length() > 255) {
            errMap.put("errAddress", "Address Vượt Quá 255 Kí Tự");
        }
        if (customer.getdOB().trim().equals("") || customer.getdOB() == null){
            errMap.put("errDate","Không để trống ngày sinh");
        }
        if (errMap.isEmpty()){
            customerRepository.insertUser(customer);
        }
        return errMap;
    }

    @Override
    public Map<String, String> updateUser(Customer customer) {
        Map<String, String> errMapEdit = new HashMap<>();
        if (customer.getName().trim().equals("") || customer.getName() == null) {
            errMapEdit.put("errName", "Tên Không Được Để Trống");
        } else if (customer.getName().equals("admin")) {
            errMapEdit.put("errName", "Không đặt tên admin");
        } else if (customer.getName().length() > 255) {
            errMapEdit.put("errName", "Tên Vượt Quá 255 Kí Tự");
        }
        if (customer.getIdCard().trim().equals("") || customer.getIdCard() == null) {
            errMapEdit.put("errIdCard", "Không Để Trống ID_Card");
        } else if (customer.getIdCard().length() > 20) {
            errMapEdit.put("errIdCard", "ID_Card vượt quá 20 kí tự");
        }
        if (customer.getPhoneNumber().trim().equals("") || customer.getPhoneNumber() == null) {
            errMapEdit.put("errPhoneNumber", "Không Để Trống Phone Number");
        } else if (customer.getPhoneNumber().length() > 20) {
            errMapEdit.put("errPhoneNumber", "Phone Number vượt quá 20 kí tự");
        }
        if (customer.getEmail().trim().equals("") || customer.getEmail() == null) {
            errMapEdit.put("errEmail", "Không Để Trống Email");
        } else if (customer.getEmail().length() > 55) {
            errMapEdit.put("errEmail", "Email vượt quá 55 kí tự");
        }
        if (customer.getAddress().trim().equals("") || customer.getAddress() == null) {
            errMapEdit.put("errAddress", "Không Để Trống Address");
        } else if (customer.getAddress().length() > 255) {
            errMapEdit.put("errAddress", "Address vượt quá 255 kí tự");
        }
        if (customer.getdOB().trim().equals("") || customer.getdOB() == null){
            errMapEdit.put("errDate","Không để trống ngày sinh");
        }
        if (errMapEdit.isEmpty()) {
            try {
                customerRepository.updateUser(customer);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return errMapEdit;
    }

    @Override
    public Customer selectCustomerByAccUser(String accUserName) throws SQLException {
        return customerRepository.selectCustomerByAccUser(accUserName);
    }
}
