package treesngraphs;

public class mirrorimage {
	public static void main(String[] args)
	{
		treelink r1=new treelink(5,null,null);

		treelink l2=new treelink(1,null,null);
		treelink lc=new treelink(3,null,null);


		treelink l1=new treelink(2,l2,lc);

		treelink root=new treelink(4,l1,r1);
		
		treenode t=new treenode();
		t.displaytree(root);
		converttomirror(root);
		System.out.println("mirror image");
		t.displaytree(root);

	}
	
	public static void converttomirror(treelink root)
	{
		if(root==null)
			return;
		converttomirror(root.left);
		converttomirror(root.right);
		
		treelink temp=root.left;
		root.left=root.right;
		root.right=temp;
	}

}
