function check()
{
	if (document.f1.n1.value=="")
	{
		alert("please enter userid");
		return false;
	}
	if (document.f1.n2.value=="")
	{
		alert("please enter password");
		return false;
	}
	else
	{
		return true;
	}
}