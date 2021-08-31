package com.project1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.project1.service.CustomerService;
import com.project1.service.CustomerServiceImpl;

/**
 * Servlet implementation class ViewBalanceServlet
 */
public class ViewBalanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger("ViewBalanceServlet");
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewBalanceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		String password=request.getParameter("password");
		
		 response.setContentType("text/html");
	     PrintWriter out=response.getWriter();
	     out.println("<body style='background-color:lightgreen;'>");
	     CustomerService customerService=new CustomerServiceImpl();
	    
	     int balance=customerService.viewBalance(customerId, password);
	     if(customerService.viewBalance(customerId, password)!=0)
	     {
	     out.println("<a href=ViewBalance.html>Back</a>");
	     out.println("<h2 align=center>Welcome"+" "+customerId);
	     out.println("<h3 align=center>Your Account Balance is:"+"  "+balance);
	     }
	     else
	     {
	    	 out.println("<br/><br/><br/><h2 align=center>please enter correct ID or Password");
	     }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
