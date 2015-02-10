package stacknqueues;

import java.util.*;

public class setofstacks {
 //program to implement a stack of plates;
	static ArrayList<Stack<Integer>> stacks= new ArrayList<Stack<Integer>>();
	public void push(int value)
	{
		Stack<Integer> last= getlaststack();
		if(last!=null && !last.isFull())
			last.push(value);
		else
		{
			Stack<Integer> s =new Stack<Integer>();
			s.push(value);
			stacks.add(s);
		}
	}
	
	public int pop()
	{
		Stack<Integer> s= getlaststack();
		int value=s.pop();
		if(s.size()==0)
			stacks.remove(stacks.size()-1);
		return value;
	}
	
	public static Stack<Integer> getlaststack()
	{
		if(stacks.size()==0)
			return null;
		else
			return stacks.get(stacks.size()-1);
	}
}
