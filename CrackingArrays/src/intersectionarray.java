import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

class num
{
	boolean present;
	int count;
	public num(boolean p, int c)
	{
		present=p;
		count=c;
	}
}

public class intersectionarray {
	//program to find intersection of 2 arrays
	public static void main(String[] args)
	{
		int[] a1=new int[]{1,7,7,7,7,7};
		int[] a2=new int[]{6,7,1,9,7,7};
		int[] arr=new int[7];
				findpair(a1,a2);
		int j=0;
		Hashtable h=new Hashtable();
		for(int i=0;i<a1.length;i++)
		{
			if(!h.containsKey(a1[i]))
				h.put(a1[i], true);
		}
		
		for(int i=0;i<a2.length;i++)
		{   
			if(h.containsKey(a2[i]))
			{
				arr[j++]= a2[i];
				h.remove(a2[i]);
			}
			
		}
		
		
		//for(int i=0;i<j;i++)
			//System.out.println(arr[i]);
	}
    public static void findpair(int[] a1, int[] a2)
    
    {   
    	int[] aj=new int[7];
		int k=0;

    	HashMap<Integer,num> map= new HashMap<Integer,num>();
    	for(int i=0;i<a1.length;i++)
    	{
    		if(map.containsKey(a1[i]))
    		{
    			num n=map.get(a1[i]);
    			int count=n.count+1;
    			map.put(a1[i], new num(false,count));
    		}
    		else
    			map.put(a1[i], new num(false,1));
    	}
    	
    	
    	for(int i=0;i<a2.length;i++)
    	{
    		if(map.containsKey(a2[i]))
    		{
    			num n=map.get(a2[i]);
    			int count=n.count-1;
    			if(count>=0)
    			{
    				aj[k++]=a2[i];
    			map.put(a2[i], new num(true,count));
    			}
    		}
    	}
    	for(int i=0;i<k;i++)
    		System.out.println(aj[i]);
    	/*for(Entry<Integer,num> e: map.entrySet())
    	{
    		num n=e.getValue();
    		if(n.present)
    		{
    			if(n.count==0)
    				System.out.println(e.getKey());
    			else
    			{
    				for(int i=0;i<n.count;i++)
    					System.out.println(e.getKey());
    			}
    		}
    	}
    }*/
}
}