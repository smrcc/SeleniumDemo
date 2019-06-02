package locators;

public class Reverse
{


	public static void main(String[] args) 
	{
		int num=654321;
		int reversenum=0;
		while(num!=0)
		{
			reversenum =reversenum*10;
			reversenum=reversenum+ num%10;
			num=num/10;
		}

		System.out.println("reverse number is "+reversenum);
	}

}
