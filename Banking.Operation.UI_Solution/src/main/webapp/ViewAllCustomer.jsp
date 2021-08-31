<%@page import="com.project1.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: red;">
<a href="EmployeeHome.html">Back</a>
	<h2 align="center">Customer Details Are</h2>
	<%
	List<Customer> customer = (List<Customer>) session.getAttribute("allCustomer");
	%>
	<table align="center" cellspecing="10" cellpadding="10">
		<th>Customer Id</th>
		<th>Customer Name</th>
		<th>Mobile Number</th>
		<th>Balance</th>
		<th>Email</th>
		<th>Registration Date</th>

		<%
		for (int i = 0; i < customer.size(); i++) {
			Customer customer1 = customer.get(i);
		%>
		<tr>
			<td><%=customer1.getCustomerId()%></td>
			<td><%=customer1.getCustomerName()%></td>
			<td><%=customer1.getMobileNumber()%></td>
			<td><%=customer1.getBalance()%></td>
			<td><%=customer1.getEmailId()%></td>
			<td><%=customer1.getRegistrationDate()%></td>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>