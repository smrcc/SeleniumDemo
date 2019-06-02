package locators;

import java.util.Comparator;
import java.util.TreeSet;

public class DescendingOrder {

	public static void main(String[] args)
	{
		TreeSet t=new TreeSet(new myComparator());
		t.add(10);
		t.add(5);
		t.add(13);
		t.add(0);
		t.add(30);
		t.add(36);
		System.out.println(t);
	}
}
class myComparator implements Comparator<Integer>
{

	public int compare(Integer i1, Integer i2) 
	{
		
		if(i1<i2)
		{
			return +1;
		}
		 else if(i1>i2)
		{
			return -1;
		}
		 else
		
		return 0;
	}
}