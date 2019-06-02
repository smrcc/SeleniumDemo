package locators;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args)
	{
		TreeSet t=new TreeSet(new  mycomparator2());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("X"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("D"));
		System.out.println(t);
	}

}
class mycomparator2 implements Comparator
{

	
	public int compare(Object a1, Object a2) 
	{
		String s1=a1.toString();
		String s2=a2.toString();
		
		return s1.compareTo(s2);
	}
	
}