function check()
{
	if (document.f1.n1.value=="")
	{
		alert("please enter fullname");
		return false;
	}
	if (document.f1.n2.value=="")
	{
		alert("please enter userid");
		return false;
	}
	if (document.f1.n3.value=="")
	{
		alert("please enter password");
		return false;
	}
	if (document.f1.n4.value=="")
	{
		alert("please enter address");
		return false;
	}
	else
	{
		return true;
	}
}