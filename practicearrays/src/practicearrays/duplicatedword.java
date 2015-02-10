package practicearrays;

import java.util.*;
import java.util.Map.Entry;

public class duplicatedword {

	//program to check whether there exist a duplicated word in a string
	public static void main(String[] args)
	{
	Scanner n = new Scanner(System.in);
	String input=n.nextLine();
	char[] a=input.toCharArray();
	HashMap<String,Integer> map= new HashMap<String,Integer>();
	int len=input.length();
	int wordstart=0;
	for(int i=0;i<len;i++)
	{
	     if(a[i]==' ')	
	     {     String k=input.substring(wordstart,i);
	    	 if(map.containsKey(k))
	    	 {   map.put(k, map.get(k)+1);
	    	      
	    	 }
	    	 
	    	 else
	    		 map.put(k, 1);
	    	 wordstart=i+1;
	     } 
	     
	     else if(i==(len-1))
	     {
	    	 String k=input.substring(wordstart,i+1);
	    	 if(map.containsKey(k))
	    	 {   map.put(k, map.get(k)+1);
	    	     
	    	 }
	    	 
	    	 else
	    		 map.put(k, 1);
	    	
	     }
	}
	 int temp=0;
	for(Entry<String, Integer> s : map.entrySet())
	{
		if(s.getValue()>1)
		{    temp=s.getValue();
		     System.out.println(s.getKey());
		}

}
	//System.out.println(temp);

	}
}