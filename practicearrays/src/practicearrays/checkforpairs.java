package practicearrays;

import java.util.Hashtable;
import java.util.Scanner;

public class checkforpairs {
		public static void main(String[]  args)
		{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter array size");
		int size=sc.nextInt();
		  int[] arr= new int[size];
		  int k=5;
		System.out.println("enter array elements");
		for(int i=0;i<size;i++)
		arr[i]=sc.nextInt();
		for(int i=0;i<size;i++)
		{   for(int j=i;j<size;j++)
		{    if(arr[i]+arr[j]==5)
		     System.out.println(arr[i]+" "+arr[j]);
		}
		}
           checkusinghash(arr,k);
		}
		
		public static void checkusinghash(int[] arr, int k)
		{
			Hashtable map=new Hashtable();
			for(int i=0;i<arr.length;i++)
				map.put(arr[i], true);
			
			for(int i=0;i<arr.length;i++)
			{
				int temp=k-arr[i];
				if(map.containsKey(temp))
				{	map.remove(arr[i]);
					System.out.println(arr[i]+""+ temp);
				}
			}
		}

		}


