package locators;

import java.util.TreeSet;

import org.apache.bcel.generic.NEW;

public class TreeSetDemo1 {

	public static void main(String[] args)
	{
		TreeSet t=new TreeSet();//for default natural sorting order  compulsory the object should be homogeneous and comparable 
		                        //otherwise we will get classcastexception.String class and all wrapper classes already implements comparable 
		                        //interface but StringBuffer doesn't implement compaerable interface.so we got CCException for this example 
		t.add(new StringBuffer("A"));
		System.out.println(t.add( new StringBuffer("Z")));
	t.add(new StringBuffer("L"));
	t.add(new StringBuffer("B"));
	System.out.println(t);

	}

}
