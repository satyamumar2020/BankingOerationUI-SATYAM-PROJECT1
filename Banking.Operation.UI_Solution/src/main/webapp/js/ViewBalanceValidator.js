function validate()
{
	var customerId=document.getElementById("customerId").value;
	var password=document.getElementById("password").value;
	if(customerId.length==0)
	{
		alert("please enter Customer ID")
		return false;
	}

	else if(password.length==0)
	{
		alert("please enter password")
		return false;
	}
	else
	{
		return true;
	}
	
}