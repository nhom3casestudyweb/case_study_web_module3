package com.example.account.repository.account;

import com.example.account.model.account.Account;
import com.example.account.model.customer.Customer;

import java.util.List;

public interface IAcountRepository {
    Account findByUserName(String userName);
    Account checkAccount(String userName, String password);
    boolean addUser(Account user);
    List<Account> getAllUser();
    boolean deleteUser(String userName);
    boolean editUser(String userName, String password);
    Customer findCustomerByUserName(String userName);
//
    String findTypeOfCustomer(Customer user);
}
