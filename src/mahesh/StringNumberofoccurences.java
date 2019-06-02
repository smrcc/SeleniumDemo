package mahesh;

import java.util.HashMap;
import java.util.Map;

public class StringNumberofoccurences 
{

	public static void main(String[] args) 
	{
		String s="chandrarao";
		HashMap<Character,Integer> m=new HashMap<Character,Integer>();
		
		for(Character c:s.toCharArray())
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			else
			{
				m.put(c, 1);
			}
		}System.out.println(m);
		

	}

}
