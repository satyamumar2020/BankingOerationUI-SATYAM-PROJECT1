package com.project1.service;

import java.util.List;

import com.project1.model.Customer;
import com.project1.model.Employee;

public interface EmployeeService {
	
	public int addEmployee(Employee employee);
	public boolean login(int employeeId,String password);
	public Customer getCustomerById(int customerId);
	public List<Customer> getCustomers();
	public boolean deleteCustomer(int customerId);

}
