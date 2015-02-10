import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class allSubstring {

	//All substring of the given string
	//there are potentially O(n^2) substrings of the given string, so printing them out cannot be done 
	//faster then that
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		HashMap<String,Boolean> map= new HashMap<String,Boolean>();
		int len = input.length();
		String sub = null;
		map.put(input,true);
		for(int i=1;i<len;i++)
		{
			for(int j=0;j<=len-i;j++)
			{
				sub = input.substring(j, i+j);
				if(!map.containsKey(sub))
				{    map.put(sub, true);
				System.out.println(sub);
				}
			}
				
		}
		System.out.println("palindroms are:");
		for(Entry<String,Boolean> e : map.entrySet())
		{
			String pal = e.getKey();
			int l = pal.length();
			if(l==1)
				{System.out.println(pal);
				 continue;
				}
			String rev = "";
			
			for(int i=l-1;i>=0;i--)
			{
				rev = rev + pal.charAt(i);
			}
			
		   if(pal.equals(rev))
			{System.out.println(pal);
			
			}

		}
	}
}