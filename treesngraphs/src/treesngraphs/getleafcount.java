package treesngraphs;

public class getleafcount {
	//program to count number of leaf nodes
	public static void main(String[] args)
	{
		treelink r1=new treelink(5,null,null);

		treelink l2=new treelink(1,null,null);
		treelink lc=new treelink(3,null,null);


		treelink l1=new treelink(2,l2,lc);

		treelink root=new treelink(4,l1,r1);
		int r=getleafcount(root);
		System.out.println(r);

	}

	public static int getleafcount(treelink root)
	{
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return 1;
		else
		return getleafcount(root.left)+getleafcount(root.right);
	}
}
