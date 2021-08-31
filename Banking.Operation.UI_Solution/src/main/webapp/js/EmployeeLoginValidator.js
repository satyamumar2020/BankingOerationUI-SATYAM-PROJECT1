function employeeValidate()
{
	var employeeId=document.getElementById("employeeid").value;
	var password=document.getElementById("password").value;
	if(employeeId.length==0)
	{
		alert("please enter Employee ID")
		return false;
	}

	else if(password.length==0)
	{
		alert("please enter password")
		return false;
	}
	else if(password.length>0)
	{
		 if(password.length<5 || password.length>15)
	     {
		     alert("enter valid password")
             return false;
	      }
	}
	else
	{
		return true;
	}
}