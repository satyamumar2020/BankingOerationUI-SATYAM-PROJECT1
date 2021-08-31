function customerValidate()
{
	var customerId=document.getElementById("customerId").value;
	if(customerId.length==0)
	{
		alert("please enter customerid")
		return false;
	}
	else
	{
		return true;
	}
}