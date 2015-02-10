package stacknqueues;

import java.util.Stack;

public class trackingminofstack {
	//program to keep track of minimum value of stack using another stack
	
	static Stack<Integer> s1=new Stack<Integer>();
	static Stack<Integer> trackmin=  new Stack<Integer>();
	public static void main(String[] args)
	{
	push(10);

	}
   public static void push(int value)
   {
	   if(value<=min())
		   trackmin.push(value);
	   s1.push(value);
   }
   public static int pop()
   {
	   int value=s1.pop();
	   if(value==min())
		   trackmin.pop();
	   return value;
   }
   public static int min()
   {
	   if(trackmin.isEmpty())
		   return Integer.MIN_VALUE;
	   else
		   return trackmin.peek();
   }
}
