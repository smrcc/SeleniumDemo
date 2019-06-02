package locators;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add("chiru");
		l.add("pawan");
		l.add("nagababu");
		l.add("alluarjun");
		System.out.println(l);
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext())
		{
			String str=(String)ltr.next();
			if(str.equals("chiru"))
			{
				ltr.set("charan");
			}
			else if(str.equals("pawan"))
			{
				ltr.add("akira");
			}
			else if(str.equals("nagababu"))
			{
				ltr.set("varun");
			}
		}System.out.println(l);
			
		
		
		

	}

}
