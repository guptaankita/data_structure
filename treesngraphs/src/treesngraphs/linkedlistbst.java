package treesngraphs;
import java.util.*;

import treesngraphs.createtree.tree;

public class linkedlistbst {
	public static void main(String[] args)
	{
		ArrayList<LinkedList<tree>> results=new ArrayList<LinkedList<tree>>();
		ArrayList<LinkedList<tree>> iterate=new ArrayList<LinkedList<tree>>();

		createtree t= new createtree();
		t.binaryinsert(10);
		t.binaryinsert(20);
		createlinkedlist(results,t.root,0);
		lliterative(t.root,iterate);
	}
	
	public static void lliterative(tree t, ArrayList<LinkedList<tree>> result)
	{
		LinkedList<tree> current= new LinkedList<tree>();
		if(t!=null)
			current.add(t);
		while(current.size()>0)
		{
			result.add(current);
			LinkedList<tree> previous=current;
			current=new LinkedList<tree>();
			for(tree n:previous)
			{   if(n.left!=null)
				current.add(n.left);
			   if(n.right!=null)
				   current.add(n.right);
			 
				
			}
			
		}
	}

	public static void createlinkedlist(ArrayList<LinkedList<tree>> results, tree t, int level)
	{ //creating linked list through recursion. Method 1
		if(t==null)
			return;
		
		LinkedList<tree> list=null;
		if(results.size()==level)
		{
			results.add(list);
		}
		else
		{
			list=results.get(level);
		}
		
		list.add(t);
		createlinkedlist(results,t.left,level+1);
		createlinkedlist(results,t.right,level+1);
	}
}
