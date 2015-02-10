package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

class item
{
	int number;
	String name;
	public item(int n, String r)
	{
		number=n;
		name=r;
	}
}

public class countonitem {
           
   public static void main(String[] args)
   {
	item a1=new item(6,"assdd");
	item a2=new item(7,"hk");
	item a3=new item(8,"ac");
	item a4=new item(6,"ak");
	item[] arr=new item[]{a1,a2,a3,a4};
	HashMap<Integer,LinkedList<String>> map=new HashMap<Integer,LinkedList<String>>();
	LinkedList<String> n=null;
	for(int i=0;i<4;i++)
	{    
		int key=arr[i].number;
		LinkedList<String> a=new LinkedList<String>();
		if(map.containsKey(key))
		{
			 a= map.get(key);
			 
			a.push(arr[i].name);
		 
		}
		else
			{ a.push(arr[i].name);
			}
		
		Collections.sort(a);
			
			map.put(key, a);
	}	
			
	
	   //int[] ar=new int[3];
	   //int i=0;
	/*for(Entry<Integer,LinkedList<String>> e: map.entrySet())
	{
		ar[i++]=e.getKey();
	}*/
    /*countsort countingSort = new countsort();
    int[] ar= map.keySet().toArray();
    int[] sortedArray = countingSort.counting_sort(ar);
    for (int j = 0; j < sortedArray.length; j++)
    {
           System.out.print(sortedArray[j] + ",");
     }
    HashMap<Integer,LinkedList<String>> m2= new HashMap<Integer,LinkedList<String>>(); 
    LinkedList<String> fa=new LinkedList<String>();
    for(int hi=0;hi<sortedArray.length;hi++)
    {   int oldkey=sortedArray[hi];
        fa.addAll(map.get(oldkey));
    	m2.put(oldkey,fa);
    }*/
	
	for(Entry<Integer,LinkedList<String>> e: map.entrySet())
	{
		System.out.println(e.getKey()); 
		LinkedList<String>list=e.getValue();
		Iterator k=list.listIterator();
		while(k.hasNext())
		{
			System.out.println(k.next());
			
		}
	}
}
}

