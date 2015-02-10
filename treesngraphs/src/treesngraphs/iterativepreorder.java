package treesngraphs;

import java.util.Stack;

public class iterativepreorder {
	//program to perform iterative preorder traversal
	public static void main(String[] args)
	{
		treelink r1=new treelink(5,null,null);

		treelink l2=new treelink(1,null,null);
		treelink lc=new treelink(3,null,null);


		treelink l1=new treelink(2,l2,lc);

		treelink root=new treelink(4,l1,r1);
		preorderiterative(root);
	}

  public static void preorderiterative(treelink root)
  {
	  Stack<treelink> s= new Stack<treelink>();
	  s.push(root);
	  while(!s.isEmpty())
	  {
		  treelink current=s.pop();
		  System.out.println(current.data);
		  if(current.right!=null)
			  s.push(current.right);
		  if(current.left!=null)
			  s.push(current.left);
	  }
  }
	
}
