package com.project1.service;

import java.util.List;

import com.project1.dao.EmployeeDAO;
import com.project1.dao.EmployeeDAOImpl;
import com.project1.model.Customer;
import com.project1.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDAO employeeDAO=new EmployeeDAOImpl();
	
	
	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.addEmployee(employee);
	}


	public boolean login(int employeeId, String password) {
		// TODO Auto-generated method stub
		return employeeDAO.login(employeeId, password);
	}

	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return employeeDAO.getCustomerById(customerId);
	}

	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return employeeDAO.getCustomers();
	}

	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return employeeDAO.deleteCustomer(customerId);
	}

}
