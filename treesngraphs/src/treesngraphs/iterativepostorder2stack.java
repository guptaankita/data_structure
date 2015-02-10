package treesngraphs;

import java.util.Stack;

public class iterativepostorder2stack {
//iterative postorder using two stack
	public static void main(String[] args)
	{
		treelink r1=new treelink(5,null,null);

		treelink l2=new treelink(1,null,null);
		treelink lc=new treelink(3,null,null);


		treelink l1=new treelink(2,l2,lc);

		treelink root=new treelink(4,l1,r1); 
		iterativepostorder(root);
		
	}
    public static void iterativepostorder(treelink root)
    {
    	Stack<treelink> s1= new Stack<treelink>();
    	Stack<treelink> s2= new Stack<treelink>();
    	s1.push(root);
    	while(!s1.isEmpty())
    	{
    		treelink top=s1.pop();
    		if(top.left!=null)
    			s1.push(top.left);
    		if(top.right!=null)
    			s1.push(top.right);
    		s2.push(top);
    	}
    	while(!s2.isEmpty())
    	{
    		System.out.println(s2.pop().data);
    	}

    }
}
