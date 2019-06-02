package locators;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new mycomparator4());
		t.add("A");
		t.add(new StringBuffer("AA"));
		t.add("B");
		t.add(new StringBuffer("BBB"));
		t.add("E");
		t.add(new StringBuffer("ZZZ"));
		t.add("X");
		t.add("A");
		t.add(new StringBuffer("DDD"));
		System.out.println(t);

	}

}
class mycomparator4 implements Comparator
{

	public int compare(Object q1, Object q2)
	{
		String s1=q1.toString();
		String s2=q2.toString();
		int l1=s1.length();
		int l2=s2.length();
		if(l1<l2)
		{
			return -1;
		}
		else if(l1>l2)
		{
			return 1;
		}
		
		return s1.compareTo(s2);
	}
}