package stringpractice;

import java.util.Scanner;

public class numerinstring {
	
	static String input;
	static String input2;

	public static void main(String []args)
	{
		
		Scanner n = new Scanner(System.in);
		input=n.nextLine();
		input2=n.nextLine();

		blowup(input);
		maxrun(input2);
		
	}
	
	public static void blowup(String n)
	{
		StringBuffer sb=new StringBuffer();
		
		int len=n.length();
		int i=0;
		for(;i<len-1;i++)
		{
		   if(Character.isDigit(n.charAt(i)))	
		   {
			   if(Character.isDigit(n.charAt(i+1)))
			   {
				   
				sb.append(n.charAt(i+1)) ;  
			   }
				   
			   else
			   {
				   int r=Character.getNumericValue(n.charAt(i));
				   for(int j=r; j>0;j--)
				   {
					   sb.append(n.charAt(i+1));
					   
					   
				   }
				   
				   
			   }
			   
		   }
			   else{
				   
				 sb.append(n.charAt(i)) ; 
				   
			   }
			   
		}
		sb.append(n.charAt(i));
			
		System.out.println(sb.toString());
		
			
	}
	
public static void maxrun(String r)
{
	int max=0;
	int curr_len=1;
	int len=r.length();
	for(int i=0;i<len-1;i++)
	{
		
		if(r.charAt(i)==r.charAt(i+1))
		curr_len= curr_len+1;
		
		else
		{	max=Math.max(max,curr_len);
		    curr_len=1;
		
		
		
		}
	}
	max=Math.max(max,curr_len);
	System.out.println(max);

}
}

