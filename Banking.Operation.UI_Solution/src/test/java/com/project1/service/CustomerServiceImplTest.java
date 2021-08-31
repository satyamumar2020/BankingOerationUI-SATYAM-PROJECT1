package com.project1.service;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.project1.model.Customer;

public class CustomerServiceImplTest {

	CustomerService customerService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		customerService = new CustomerServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		customerService=null;
	}

	@Test
	public void testAddCustomer() {
		//Customer customer = new Customer(222, "neha", "neha@123", 5000, "8867205331", "tufailahmedkhan@gmail.com", new Date());
		//assertEquals(222, customerService.addCustomer(customer));	
		fail();}

	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsCustomerExists() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewBalance() {
		int customerId=122;	
		String password="neha@123";
		assertEquals(5000, customerService.viewBalance(customerId,password));	}

	@Test
	public void testDeposit() {
		fail("Not yet implemented");
	}

	@Test
	public void testWithdraw() {
		fail("Not yet implemented");
	}

	@Test
	public void testTransferAmount() {
		fail("Not yet implemented");
	}

}
