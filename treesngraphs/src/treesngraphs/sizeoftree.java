package treesngraphs;

public class sizeoftree {
	
	public static void main(String[] args)
	{   
		treelink r1=new treelink(60,null,null);

		treelink l2=new treelink(20,null,null);

		treelink l1=new treelink(40,l2,null);

		treelink root=new treelink(100,l1,r1);
		int r=calculatesize(root);
		System.out.println(r);
		//time complexity : O(n)
		//size of call stack, space complexity: O(n)
		deletetree(root);
		treenode t=new treenode();
		t.displaytree(root);
	} 
     
	public static int calculatesize(treelink root)
	{
		if(root==null)
			return 0;
		
		return (calculatesize(root.left))+1+(calculatesize(root.right));
	}
	
	public static void deletetree(treelink root)
	{
		if(root==null)
			return;
		deletetree(root.left);
		deletetree(root.right);
		System.out.println("deleting: "+ root.data);
		root.data=0;
		root.left=null;
		root.right=null;
		
		
	}
}
