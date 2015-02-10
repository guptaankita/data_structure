import java.util.Arrays;
import java.util.Scanner;


public class question1 {
	//program to find whether a string contains unique character or not 
	//here run time complexity is O(n log n)
	
	public static void main(String[] args)
	{
		Scanner n=new Scanner(System.in);
		String input=n.nextLine();
		int len=input.length();
		char[] inputchar=new char[len];
		question1 a=new question1();
		int i=0;
		for(;i<len;i++)
		{
			inputchar[i]=input.charAt(i);
		}
		Arrays.sort(inputchar,0,len);
		for(i=0;i<len-1;i++)
		{
			if(inputchar[i]==inputchar[i+1])
				break;
		}
		if(i==(len-1))
			System.out.println("Do not contain duplicates");
		else
			System.out.println("Contains duplicate");
		boolean r=a.isUniqueChars(input);
		System.out.println(r);
	} 
	
	//another version by using an array of boolean variable
	// here the time complexity is O(n)
	//and space complexity is O(1)
	//assuming that the character st is ASCII
	public boolean isUniqueChars(String str)
	{
		if(str.length()>256)
			return false;
		boolean[] char_set=new boolean[256];
		for(int i=0;i<str.length();i++)
		{
			int val=str.charAt(i);
			if(char_set[val])
				return false;
			char_set[val]=true;
		}
		return true;
	}

}
