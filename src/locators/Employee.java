package locators;

public class Employee implements Comparable
{
	String name;
	int eid;
	Employee(String name,int eid)
	{
		this.eid=eid;
		this.name=name;
	}
public String tostring()
{
	return name+"============"+eid;
	
}
	
	public int compareTo(Object o) 
	{
		int eid1=this.eid;
		
		Employee e=(Employee)o;
		int eid2=e.eid;
		
		if(eid1<eid2)
		{
			return -1;
		}
		else if(eid1>eid2)
		{
			return 1;
		}
		else
		return 0;
	}

}
