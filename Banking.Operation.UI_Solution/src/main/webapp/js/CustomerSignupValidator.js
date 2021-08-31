function validate(){
		var customerName = document.getElementById("customerName").value
		var password = document.getElementById("password").value
		var confirmpassword = document.getElementById("confirmpassword").value
		var mobile = document.getElementById("mobileNumber").value
		var email = document.getElementById("emailId").value
	

		//Todo
		//validate gender
		//validate notifications
		//validate payment options
		
		if(customerName.length ==0)
		{
			alert("please enter customer name");
			return false;
		}
		else if(password.length ==0)
		{
				alert("please enter Password");
				return false;
		}
		else if(confirmpassword.length ==0)
		{
				alert("please enter Confirm Password");
				return false;
		}
		else if(confirmpassword != password)
		{
				alert("Confirm Password and password must be same");
				return false;
		}
		else if(mobile.length ==0)
		{
				alert("please enter mpbile number");
				return false;
		}
		else if(email.length ==0)
		{
				alert("please enter emailid");
				return false;
		}
		
		else
		{
			
			return true;
		}
}