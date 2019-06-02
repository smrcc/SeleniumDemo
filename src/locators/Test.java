package locators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args)
	{
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp("appala", 333));
		al.add(new Emp("mahesh", 222));
		al.add(new Emp("babu", 111));
		
		
		for(Emp e:al)
		{
			System.out.println(e.eid+"=========="+e.ename);
		}
		
		

	}

}
