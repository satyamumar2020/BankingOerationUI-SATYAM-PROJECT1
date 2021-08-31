package com.project1.dao;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.project1.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	private static Logger logger = Logger.getLogger("CustomerDAOImpl");
	AnnotationConfiguration configuration=new AnnotationConfiguration().configure();
	SessionFactory factory=configuration.buildSessionFactory();
	Session session=factory.openSession();

	public int addCustomer(Customer customer) {
		Transaction transaction=session.beginTransaction();
		session.save(customer);
		logger.info("customer added successfully");
		int customerId=customer.getCustomerId();	
		transaction.commit();
		return customerId;

	}
	
	public boolean login(int customerId, String password) {
		 Query query = session.createQuery("from Customer where customerId = "+customerId+ " and password = '"+password + "'");
	        if (query.list().size() == 0)
	        {
	          return false;
	        }
	        else
	        {
	          return true;
	        }
	}

	public boolean updateCustomer(Customer customer) {
		Transaction transaction=session.beginTransaction();
		session.update(customer);
		transaction.commit();
		return true;
	}

	public boolean isCustomerExists(int customerId) {
		Customer customer =  (Customer) session.get(Customer.class, customerId);
		if(customer ==null)
			return false;
		else
			return true;
	}

	public int viewBalance(int customerId,String password) {
//		Customer customer =  (Customer) session.get(Customer.class, customerId);
////		Customer customer1 =  (Customer) session.get(Customer.class, password);
//		System.out.println(customer);
////		System.out.println(customer1);
		boolean check=login(customerId, password);
		if(check)
		{
		Query query = session.createQuery("select balance from com.project1.model.Customer where customerId ="+customerId);
		int balance =  (Integer) query.list().get(0);
		logger.info("The balance for :"+customerId + " is "+balance);
		return balance;
		}
		else
			return 0;
	}

	public int  deposit(int customerId,int amount) {
		
		Customer customer=(Customer) session.load(Customer.class,customerId);
		Transaction transaction=session.beginTransaction();
		logger.info("Amount"+amount+"deposited");
	    int balance=customer.getBalance();
	    balance=balance+amount;
	    customer.setBalance(balance);
		transaction.commit();
		return balance;
		
	}
		
		
		
	public int withdraw(int customerId,int amount) {
		Customer customer=(Customer) session.load(Customer.class,customerId);
		Transaction transaction=session.beginTransaction();
		logger.info("Amount"+amount+"withdrawl");
	    int balance=customer.getBalance();
	    balance=balance-amount;
	    customer.setBalance(balance);
		transaction.commit();
		return balance;	}

	public int transferAmount(int senderId, int receiverId, int amount) {
		Customer customer=(Customer) session.load(Customer.class,senderId);
		Customer customer1=(Customer) session.load(Customer.class,receiverId);
		Transaction transaction=session.beginTransaction();
		logger.info("transfer successfull");
		int balance=customer.getBalance();
		balance=balance-amount;
		customer.setBalance(balance);
		int balance1=customer1.getBalance();
		balance1=balance1+amount;
		customer1.setBalance(balance1);
		transaction.commit();
		return balance;
	
	}

}
