package locators;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) 
	{
		LinkedHashSet h=new LinkedHashSet();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		
		h.add("null");
		h.add(10);
		System.out.println(h);
		System.out.println(h.add("B"));
	

	}

}
