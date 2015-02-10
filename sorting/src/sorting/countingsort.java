package sorting;
  

class item2
{
	int num;
	String name;
	public item2(int n, String r)
	{
		num=n;
		name=r;
	}
}
public class countingsort {

	//program to implement counting sort
	public static void main(String[] args)
	{    
		item a1= new item(1,"aa");
		item a2= new item(2,"rr");
		item a3=new item(8,"hh");
		item a4=new item(4,"ww");
		item[] arraytosort=new item[]{a1,a2,a3,a4};
		item[] sortedarray=countsort(arraytosort);
		for(int i=0;i<sortedarray.length;i++)
			System.out.println(sortedarray[i].num + ","+ sortedarray[i].name);
		
	}
	
	public static item[] countsort(item[] arr)
	{    
		int len=arr.length;

	    item j= null;
	    j=getMaxVal(arr);
	    int k=j.num;
		int c[]=new int[k+1];
		item[] sorted=new item[len];

		
		for(int i=0;i<arr.length;i++)
			c[arr[i].num]=c[arr[i].num]+1;
		for(int i=1;i<k+1;i++)
		    c[i]+=c[i-1];
		for(int i=len-1;i>=0;i--)
			{
			sorted[c[arr[i].num]-1]=arr[i];
			c[arr[i].num]=c[arr[i].num]-1;
			}
		return sorted;
			
	}
	
	
	
	 public static item getMaxVal(item[] arrayToSort)
	 {
	       int maxVal = Integer.MIN_VALUE;
	       item m = null;
	       for (item i : arrayToSort)
	       {
	            if (i.num > maxVal)
	            {
	                 m = i;
	            }
	       }
	       return m;
	  }
	 
	 
	}



