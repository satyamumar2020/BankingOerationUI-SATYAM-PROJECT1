package com.project1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.project1.model.Customer;
import com.project1.model.Employee;
import com.project1.service.CustomerService;
import com.project1.service.CustomerServiceImpl;
import com.project1.service.EmployeeService;
import com.project1.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeSignUpServlet
 */
public class EmployeeSignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger("EmployeeSignUpServlet");
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeSignUpServlet() {
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
		String employeeName = request.getParameter("employeeName");
		String password = request.getParameter("password");
		String mobileNumber = request.getParameter("mobileNumber");
		String emailId = request.getParameter("emailId");
		
		
		int employeeId=(int) (100+Math.random()*900);
		Employee employee = new Employee(employeeId, employeeName, password,mobileNumber, emailId, new Date());
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.addEmployee(employee);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<body style='background-color:lightgreen;'>");
		response.getWriter().println("<br/><br/><br/><h2 align=center>"+employeeName + ", congratulations you have successfully registerd as a Bank employee");
        
		out.println("<h3 align=center>This is your Employee ID for future Logins:"+" "+employeeId);
		out.println("<h4 align=center> please Login to Start your work "+"  "+"<a href=EmployeeLogin.html>Login</a>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
