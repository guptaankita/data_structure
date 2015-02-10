package practicearrays;

public class rotatedarray {
 // program to find a element in a rotated pivoted sorted array
	public static void main(String[] args)
	{
		int[] a= new int[]{2,2,5,2,2,2};
		int r=search(a,0,a.length-1,5);
		System.out.println(r);
	}
	public static int search(int[] a, int start,int end,int k)
	{
		int mid=(start+end)/2;
		if(a[mid]==k)
			return mid;
		if(end<start)
			return -1;
		if(a[start]<a[mid])
		{
			if(a[start]<=k && k<=a[mid])
			return	search(a,start,mid-1,k);
			else
			return	search(a,mid+1,end,k);
		}
		else if(a[mid]<a[end])
		{
			if(a[mid]<=k && k<=a[end])
				return search(a,mid+1,end,k);
			else
				return search(a,start,mid-1,k);
		}
		else if(a[start]==a[mid])
		{
			if(a[mid]!=a[end])
				return search(a,mid+1,end,k);
			else
			{
				int result=search(a,start,mid-1,k);
				if(result==-1)
					return search(a,mid+1,end,k);
				else
					return result;
			}
		}
		return -1;
		}
	}
	

