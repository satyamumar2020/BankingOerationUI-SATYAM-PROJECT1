package com.project1.dao;

import java.util.List;

import com.project1.model.Customer;
import com.project1.model.Employee;

public interface EmployeeDAO {

	public int addEmployee(Employee employee);
	public boolean login(int employeeId,String password);
	public Customer getCustomerById(int customerId);
	public List<Customer> getCustomers();
	public boolean deleteCustomer(int customerId);
}
