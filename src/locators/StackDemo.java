package locators;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("null");
		//s.push("A");
		System.out.println(s);
		
		System.out.println(s.search("A"));
		System.out.println(s.search("Z"));
		s.pop();
		System.out.println(s);
		

	}

}
