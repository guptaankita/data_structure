package treesngraphs;

import java.util.LinkedList;
import java.util.Queue;

public class levelordertraversal {
	
	//program to perform level order tree traversal
	public static void main(String[] args)
	{
		treelink r1=new treelink(5,null,null);

		treelink l2=new treelink(1,null,null);
		treelink lc=new treelink(3,null,null);


		treelink l1=new treelink(2,l2,lc);

		treelink root=new treelink(4,l1,r1);
		
		LinkedList<treelink> current= new LinkedList<treelink>();
		if(root!=null)
			current.add(root);
		
		while(current.size()>0)
		{
			LinkedList<treelink> previous=current;
			current= new LinkedList<treelink>();
			System.out.println("new level");
			for(treelink l: previous)
			{
				System.out.println(l.data);
				if(l.left!=null)
					current.add(l.left);
				if(l.right!=null)
					current.add(l.right);
			}
		}
		
		System.out.println("using queue");
		queuelevelorder(root);

	}
	public static void queuelevelorder(treelink root)
	{
		//program to perfrom level order using queue;
		
		Queue<treelink> q= new LinkedList<treelink>();
		q.add(root);
		treelink current;
		while(!q.isEmpty())
		{   
			current=q.remove();
			System.out.println(current.data);
			if(current.left!=null)
			q.add(current.left);
			if(current.right!=null)
				q.add(current.right);
		
		}
	}

}
