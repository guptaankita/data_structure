import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class question5 {
	public static void main(String[] args)
	{
		Scanner n=new Scanner(System.in);
		String input=n.nextLine();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		int len=input.length();
		char[] a=input.toCharArray();
		
		for(char s: a)
		{
			if(map.containsKey(s))
			{
				map.put(s, (map.get(s)+1));
			}
			else
			    map.put(s, 1);
		}
		
		String result="";
		StringBuilder sb =new StringBuilder();
		
		for(Map.Entry<Character, Integer> entry: map.entrySet())
		{    
			
			//result=entry.getKey().toString()+entry.getValue().toString()+result;
			sb.append(entry.getKey());
			sb.append(entry.getValue());
			
			
		}
		result=sb.toString();
		if(result.length()<len)
		System.out.println(result);
		else
			System.out.println(input);
		
		String r=compressBetter(input);
	

		
		int size=countcompression(r);
				if(r.length()>=input.length())
					System.out.println(input);
				else
					System.out.println(r);


	}
				
private static String compressBetter(String input) {

		
		StringBuffer sb= new StringBuffer();
		char last=input.charAt(0);
		int count=1;
		for(int i=1;i<input.length();i++)
		{
			if(input.charAt(i)==last)
			{
				count++;
			}
			else
			{  
				sb.append(last);
				sb.append(count);
				last=input.charAt(i);
				count=1;
			}
			
			
		}
		sb.append(last);
		sb.append(count);

		
		return sb.toString();
	}
	
	public static int countcompression(String str)
	{
		if(str==null|| str.isEmpty())
			return 0;
		char last=str.charAt(0);
		int size=0;
		int count=1;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==last)
			{
				count++;
			}
			else
			{
				last=str.charAt(i);
				size+=1+ String.valueOf(count).length();
				count=1;
			}
			
		}
		size+=1+String.valueOf(count).length();
		return size;

		}
	}


