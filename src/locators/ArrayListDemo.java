package locators;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList l=new ArrayList();
		l.add("a");
		l.add(10);
		l.add("a");
		l.add("null");
System.out.println(l);
l.remove(2);
System.out.println(l);
l.add("m");
System.out.println(l);
l.add(2,"A");
System.out.println(l);

	}

}
