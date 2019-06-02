package locators;

import java.util.*;

public class Comp {

	public static void main(String[] args)
	{
		Employee e1=new Employee("appala", 36);
		Employee e2=new Employee("mahesh", 436);
		Employee e3=new Employee("babu", 4367);
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		System.out.println(t);
	

	}

}
