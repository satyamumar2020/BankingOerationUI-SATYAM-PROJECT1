package com.project1.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.project1.model.Customer;
import com.project1.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static Logger logger = Logger.getLogger("EmployeeDAOImpl");
	AnnotationConfiguration configuration=new AnnotationConfiguration().configure();
	SessionFactory factory=configuration.buildSessionFactory();
	Session session=factory.openSession();
	
	public int addEmployee(Employee employee) {
		Transaction transaction=session.beginTransaction();
		logger.info("customer Details");
		session.save(employee);
		int employeeId=employee.getEmployeeId();
		transaction.commit();
		return employeeId;

	}

	public boolean login(int employeeId, String password) {
		Query query=session.createQuery("from Employee where employeeId= "+employeeId+ "and password = '"+password + "'");
		if(query.list().size()==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public Customer getCustomerById(int customerId) {
		Customer customer =  (Customer) session.load(Customer.class, customerId);
		return customer;
	}

	public List<Customer> getCustomers() {
		Query query = session.createQuery("from com.project1.model.Customer");
		List<Customer> customers = query.list();
		return customers;
		
	}

	public boolean deleteCustomer(int customerId) {
		Transaction transaction = session.beginTransaction();
		logger.info("customer deleted");
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		return true;
	}

}
