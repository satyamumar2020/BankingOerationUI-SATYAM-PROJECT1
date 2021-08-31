package com.project1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project1.model.Customer;
import com.project1.service.CustomerService;
import com.project1.service.CustomerServiceImpl;

/**
 * Servlet implementation class SignUpServlet
 */
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerName = request.getParameter("customerName");
		String password = request.getParameter("password");
		int balance = Integer.parseInt(request.getParameter("balance"));
		String mobileNumber = request.getParameter("mobileNumber");
		String emailId = request.getParameter("emailId");
		
		int customerId=(int) (100+Math.random()*900);
		
		Customer customer = new Customer(customerId , password, customerName, balance, mobileNumber, emailId, new Date());
		
		CustomerService customerService = new CustomerServiceImpl();
		 
		customerService.addCustomer(customer);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<body style='background-color:lightgreen;'>");
		response.getWriter().println("<br/><br/><br/><h2 align=center>"+customerName + ", congratulations you have successfully opened an account in our bank with balance of INR "+" "+balance);
  
		out.println("<h3 align=center text-color:red>This is your Customer ID for future Logins :"+" "+customerId);
		out.println("<h4 align=center> please Login to your Account"+"    "+"<a href=UserLogin.html>Login</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
