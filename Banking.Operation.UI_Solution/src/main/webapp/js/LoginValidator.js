function validate()
{
	var userId=document.getElementById("customerid").value;
	var password=document.getElementById("password").value;
	if(userId.length==0)
	{
		alert("please enter Customer ID")
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