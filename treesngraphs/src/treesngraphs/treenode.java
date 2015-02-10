package treesngraphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class treelink
{
	int data;
	treelink left;
	treelink right;
	public treelink(int d, treelink l, treelink r)
	{
		data=d;
		left=l;
		right=r;
	}


}


public class treenode {
	  
	public static void main(String[] args)
	{   
		treelink r1=new treelink(60,null,null);

		treelink l2=new treelink(20,null,null);

		treelink l1=new treelink(40,l2,null);

		treelink root=new treelink(100,l1,r1);
		displaytree(root);
	}
	
	public static void displaytree(treelink root)
	{  
		//inorder traversal without using iteration
		treelink current=root;
		boolean done =false;
		Stack<treelink> s=new Stack<treelink>();

		while(!done)
		{
	
			if(current!=null)
			{   
				//System.out.println(current.data);
				s.push(current);
				current=current.left;
			}
				
			else
			{
				if(!s.isEmpty())
				{
					current = s.pop();
					System.out.println(current.data);
					current=current.right;
				}
				
				else
				{
					done=true;
				}
			}
		
	    }
	}
}

