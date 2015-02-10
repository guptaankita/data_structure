package practicearrays;

import java.util.*;

public class repeatedchar {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String input=in.nextLine();
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		for(int i=0;i<input.length();i++)
		{    char s=input.charAt(i);
			if(map.containsKey(s))
				map.put(s, map.get(s)+1);
			else
				map.put(s, 1);
		}
		
		char s=checkchar(map,input);
		System.out.println(s);
	}
	
	public static char checkchar(HashMap<Character,Integer> map, String input)
	{
		for(int i=0;i<input.length();i++)
		{
			char s=input.charAt(i);
			if(map.get(s).intValue()==1)
				return s;
		}
		return (Character)null;
	}
}

