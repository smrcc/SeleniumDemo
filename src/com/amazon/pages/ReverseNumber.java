package com.amazon.pages;

public class ReverseNumber 
{
	

	public static void main(String[] args) 
	{
		int a=1234;
		 int reverse=0;
		 while(a!=0)
		 {
			 int digit=a%10;
			 reverse=reverse*10+digit;
			 a/=10;
			 System.out.println(reverse);
			 
		 }
	

	}

}
