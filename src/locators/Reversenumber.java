package locators;

import java.util.Scanner;

public class Reversenumber 
{

	public static void main(String[] args)
	{
		int num,reversenum=0;
		System.out.println("input your number and enter:--------------");
		Scanner sc=new Scanner(System.in);
		num =sc.nextInt();
		while(num!=0)
		{
			reversenum=reversenum*10;
			reversenum=reversenum+  num%10;
			num=num/10;
			
		}
		System.out.println("reverse of number is  "+reversenum);
	
	}

}
