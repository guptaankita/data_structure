package practicearrays;
import java.util.*;
public class reversewords {
	//program to reverse words in a string
	public static void main(String[] args)
	{
	Scanner n = new Scanner(System.in);
	String input=n.nextLine();
	String test="abcd efgh";
	char[] t=test.toCharArray();
	char[] a=input.toCharArray();
	int len=input.length();
	reverse(a,0,len-1);
	int wordstart=0;
	for(int i=0;i<len;i++)
	{   
		if(a[i]==' ')
		{
			reverse(a,wordstart,i-1);
			wordstart=i+1;
	}
		else if(i==(len-1))
			reverse(a,wordstart,i);
	
	
	}
	
	System.out.println("reverse string"+ new String(a));
	reverse(t,0,t.length-1);
	System.out.println("test string :" + new String(t));
	
	}
	public static void reverse(char[] a, int start, int end)
	{
		while(start<end)
		{
			a[start]=(char) (a[start]^a[end]);
			a[end]=(char)(a[start]^a[end]);
			a[start]= (char)(a[start]^a[end]);
			start++;
			end--;
		}
	}
}
