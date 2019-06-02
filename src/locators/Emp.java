package locators;

public class Emp implements Comparable
{
int eid;
String ename;
Emp(String ename,int eid)
{
	this.eid=eid;
	this.ename=ename;
}

public int compareTo(Object o)
{
	Emp e=(Emp)o;
	if(eid==eid)
	{
		return 0;
	}
	
	else if(eid>e.eid)
	{
		return 1;
	}
	else
	return -1;
}

}
