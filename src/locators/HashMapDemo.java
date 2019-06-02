package locators;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> obj1=new HashMap<Integer,String>();
		obj1.put(111, "appala");
		obj1.put(333, "andhra pradesh");
		obj1.put(555, "india");
		obj1.put(777, "babu");
		obj1.put(999, "mahesh");
		System.out.println(obj1);
		String str=obj1.get(777);
		System.out.println(str);
	String obj=obj1.get(111);
	System.out.println(obj);
	for(Map.Entry<Integer,String> data:obj1.entrySet())
	{
		System.out.println("Key from map is  "+ data.getKey() +  " and value is  "+data.getValue());
	}
	

	}

}
