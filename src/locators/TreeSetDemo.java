package locators;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		t.add("a");
		t.add("A");
		t.add("z");
		t.add("b");
		t.add("Z");
		//System.out.println(t.add(10)); class cast exception
		//t.add(null); //NPE
		System.out.println(t);
		

	}

}
