package com.project1.dao;

import com.project1.model.Customer;

public interface CustomerDAO {
	//As a customer, I can create new account
	public int addCustomer(Customer customer);
	//As a customer, I can login
	public boolean login(int customerId,String password);
	//As a customer, I can update my details
	public boolean updateCustomer(Customer customer);
	
	public boolean isCustomerExists(int customerId);
	
	//* As a customer, I can view the balance of a specific account. * 
	public int viewBalance(int customerId,String password);
	
	//As a customer, I can make a withdrawal or deposit 
	public int deposit(int customerId,int amount);
	public int withdraw(int customerId,int amount);
	//As a customer, I can transfer amount 
	public int transferAmount(int senderId,int receiverId,int amount);


}
