package treesngraphs;

import treesngraphs.createtree.tree;

public class treebalanced {
 
	
	//program to check if a tree is balanced
	public static void main(String[] args){
		createtree t=new createtree();
		t.binaryinsert(10);
		t.binaryinsert(20);
		t.binaryinsert(40);
		boolean r=checkbalance(t.root);
		System.out.println(r);
	
	}
		public static boolean checkbalance(tree t)
		{
			if(checkheight(t)>0)
				return true;
			else
				return false;
		}
		
	public static int checkheight(tree t)
	{
		if(t==null)
			return 0;
	
			int left=checkheight(t.left);
		    if(left==-1)
		    	return -1;
		    int right=checkheight(t.right);
		    if(right==-1)
		    	return -1;
		    
		    int diff=left-right;
		    if(Math.abs(diff)>1)
		    	return -1;
		    else
		    	return Math.max(left, right)+1;
		    
	}
}
