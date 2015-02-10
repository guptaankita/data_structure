package stacknqueues;

import java.util.Stack;

public class sortstack {
	//program to sort stack in ascending order
	public static Stack<Integer> sort(Stack<Integer> s)
	{
		Stack<Integer> r= new Stack<Integer>();
		while(!s.isEmpty())
		{
			int tmp=s.pop();
			while(!r.isEmpty() && r.peek()>tmp)
			{
				s.push(r.pop());
			}
			r.push(tmp);
		}
		return r;
	}

}
