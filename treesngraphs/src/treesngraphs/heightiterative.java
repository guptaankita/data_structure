package treesngraphs;

import java.util.LinkedList;
import java.util.Queue;

public class heightiterative {
	//program to find height of a tree iteratively
	public static void main(String[] args)
	{
		treelink r1=new treelink(5,null,null);

		treelink l2=new treelink(1,null,null);
		treelink lc=new treelink(3,null,null);


		treelink l1=new treelink(2,l2,lc);

		treelink root=new treelink(4,l1,r1); 
		int r=findheight(root);
		System.out.println(r);
	}

	
	public static int findheight(treelink root)
	{
		if(root==null)
			return 0;
		Queue<treelink> q=new LinkedList<treelink>();
		q.add(root);
		int height=0;
		int nodecount=0;
		while(true)
		{
			nodecount=q.size();
			if(nodecount==0)
				return height;
			height++;
			
			while(nodecount>0)
			{
				treelink current=q.remove();
				if(current.left!=null)
					q.add(current.left);
				if(current.right!=null)
					q.add(current.right);
				nodecount--;

				
				
				
			}
			
		}
		
	}
}
