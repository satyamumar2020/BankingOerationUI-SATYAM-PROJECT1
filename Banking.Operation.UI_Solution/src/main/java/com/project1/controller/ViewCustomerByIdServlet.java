package com.project1.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project1.model.Customer;
import com.project1.service.EmployeeService;
import com.project1.service.EmployeeServiceImpl;

/**
 * Servlet implementation class ViewCustomerByIdServlet
 */
public class ViewCustomerByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCustomerByIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int customerId=Integer.parseInt(request.getParameter("customerId"));
		EmployeeService employeeService=new EmployeeServiceImpl();
		Customer customer=employeeService.getCustomerById(customerId);
		
		List<Customer> customers=new ArrayList<Customer>();
		customers.add(customer);
		HttpSession session=request.getSession();
		session.setAttribute("allCustomer",customers);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("ViewAllCustomer.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
