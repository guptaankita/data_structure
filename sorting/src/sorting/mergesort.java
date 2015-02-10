package sorting;
import java.util.*;

public class mergesort {
	
	
	public static void main(String[] args)
	{         Scanner sc = new Scanner(System.in);
	System.out.println("please enter array size");
	int size=sc.nextInt();
	        int[] arr= new int[size];
	System.out.println("enter array elements");
	for(int i=0;i<size;i++)
	arr[i]=sc.nextInt();
	int k=10;

	                
	                 mergeSort(arr);
	                 
	                 for(int i=0;i<arr.length;i++)
	                		System.out.println(arr[i]);
	                 
	                 checksum(arr,k);

	}
	public static void mergeSort(int[] arr)
	{
	         if(arr.length>1)
	{
	int left[]=leftarray(arr);
	int right[]=rightarray(arr);
	mergeSort(left);
	mergeSort(right);
	merge(arr,left,right);
	      }
	}
	public static int[] leftarray(int[] arr)
	{    int size1=arr.length/2;
	    int[] left=new int[size1];
	for(int i=0;i<size1;i++)
	left[i]=arr[i];
	return left;
	}

	public static int[] rightarray(int[] arr)
	{      int size1=arr.length/2;
	        int size2= arr.length-size1;
	int[] right=new int[size2];
	  for(int i=0;i<size2;i++)
	right[i]=arr[i+size1];
	return right;

	} 
	public static void merge(int[] arr, int[] left, int[] right)
	{ 
	     int i1=0,i2=0;
	for(int i=0;i<arr.length;i++)
	{   if(i2>=right.length|| (i1<left.length && left[i1]<=right[i2]))
	{   arr[i]=left[i1];
	  i1++;
	}
	else 
	{   arr[i]=right[i2];
	    i2++;
	}
	}
		}
	
	public static void checksum(int[] arr, int k)
	{
		int l=0;
		int r=arr.length-1;
		while(l<r)
		{
			if(arr[l]+arr[r]==k)
				{  System.out.println(arr[l]+"   "+ arr[r]);
				   l++;
				   r--;
				}
			else if(arr[l]+arr[r]<k)
				l++;
			else 
				r--;
		}
		if(l==r)
			System.out.println("no such pair");
	}
	
	
	}


