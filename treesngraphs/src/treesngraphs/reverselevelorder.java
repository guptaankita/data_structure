package treesngraphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverselevelorder {

	//program to perform reverse level order traversal;
	public static void main(String[] args)
	{
		treelink r1=new treelink(5,null,null);

		treelink l2=new treelink(1,null,null);
		treelink lc=new treelink(3,null,null);


		treelink l1=new treelink(2,l2,lc);

		treelink root=new treelink(4,l1,r1);
		reverseorder(root);
	}
	
	public static void reverseorder(treelink root)
	{
		Queue<treelink> q= new LinkedList<treelink>();
		Stack<treelink> s=new Stack<treelink>();
		q.add(root);
		while(!q.isEmpty())
		{
			treelink top=q.remove();
			s.push(top);
			if(top.right!=null)
				q.add(top.right);

			if(top.left!=null)
				q.add(top.left);
		}
		while(!s.isEmpty())
		{
			treelink top=s.pop();
			System.out.println(top.data);
		}
	}
}
