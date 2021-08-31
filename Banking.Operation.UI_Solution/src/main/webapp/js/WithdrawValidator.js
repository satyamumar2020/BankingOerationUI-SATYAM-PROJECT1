function validate()
{
	var customerid=document.getElementById("customerid").value;
	var amount=document.getElementById("amount").value;
	if(customerid.length==0)
	{
		alert("please enter customerid")
		return false;
	}
	else if(amount.length==0)
	{
		alert("please enter amount to Deposite")
		return false;
	}
	else
	{
		return true;
	}
}