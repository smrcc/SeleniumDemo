package locators;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args)
	{
		Vector<Integer> v=new Vector<Integer>();
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}System.out.println(v.capacity());
		System.out.println(v);
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements())
		{
			Integer i=(Integer)e.nextElement();     //return type of nextelement is object type so we needto  perform type casting
			if(i%2==0)                                 //if we put i%2==1 odd numbers print i%2==0 even numbers print
			{
				System.out.println(i);
			}
			
		}
		System.out.println(v);

	}

}
