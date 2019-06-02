package locators;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) 
	{
		TreeSet<String> t=new TreeSet<String>(new mycomparator1());
		t.add("mahesh");
		t.add("babu");
		t.add("appala");
		t.add("india");
		t.add("andhrapradesh");
		t.add("prakasam");
		t.add("cheervanuppalapadu");
		System.out.println(t);

	}

}
class mycomparator1 implements Comparator
{
	
	public int compare(Object a1, Object a2) 
	{
		String s1=(String)a1;
		//String s2=(String)a2;
		String s2=a2.toString();
		
		//return -s1.compareTo(s2);
		
		return s2.compareTo(s1);
	}
	
}