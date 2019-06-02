package com.amazon.pages;

public class Reverse
{
	

	public static void main(String[] args) 
	{
		int num=123456;
		int reverse=0;
		while(num!=0)
		{
			int digit=num%10;
			
			reverse=digit+reverse*10;
		
			num/=10;
		}
		System.out.println(reverse);

	}

}
