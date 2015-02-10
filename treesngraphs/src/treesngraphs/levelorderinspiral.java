package treesngraphs;

import java.util.Stack;

public class levelorderinspiral {
	//program to perfrom level order traversal in spiral form
	public static void main(String[] args)
	{
		treelink r1=new treelink(5,null,null);

		treelink l2=new treelink(1,null,null);
		treelink lc=new treelink(3,null,null);


		treelink l1=new treelink(2,l2,lc);

		treelink root=new treelink(4,l1,r1);
		printspiral(root);
	}

	public static void printspiral(treelink root)
	{
		Stack<treelink> s1=new Stack<treelink>();
		Stack<treelink> s2=new Stack<treelink>();
		s1.push(root);
		while(!s1.isEmpty()||!s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
			treelink curr=s1.pop();
			System.out.println(curr.data);
			if(curr.right!=null)
				s2.push(curr.right);
			if(curr.left!=null)
				s2.push(curr.left);
			}
			
			while(!s2.isEmpty())
			{
				treelink curr=s2.pop();
				System.out.println(curr.data);
				if(curr.left!=null)
					s1.push(curr.left);
				if(curr.right!=null)
					s1.push(curr.right);

			}
		}
	}

}
