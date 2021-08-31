package com.project1.service;

import com.project1.dao.CustomerDAO;
import com.project1.dao.CustomerDAOImpl;
import com.project1.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerDAO customerDAO=new CustomerDAOImpl();

	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.addCustomer(customer);
	}
	
	public boolean login(int customerId, String password) {
		// TODO Auto-generated method stub
		return customerDAO.login(customerId, password);
	}

	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.updateCustomer(customer);
	}

	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.isCustomerExists(customerId);
	}

	public int viewBalance(int customerId,String password) {
		// TODO Auto-generated method stub
		return customerDAO.viewBalance(customerId,password);
	}

	public int deposit(int customerId, int amount) {
		// TODO Auto-generated method stub
		return customerDAO.deposit(customerId, amount);
	}

	public int withdraw(int customerId, int amount) {
		// TODO Auto-generated method stub
		return customerDAO.withdraw(customerId, amount);
	}

	public int transferAmount(int senderId, int receiverId, int amount) {
		// TODO Auto-generated method stub
		return customerDAO.transferAmount(senderId, receiverId, amount);
	}

}
