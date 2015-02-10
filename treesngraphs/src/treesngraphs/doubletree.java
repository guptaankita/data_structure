package treesngraphs;

public class doubletree {
 //program to double a tree
	public static void main(String[] args)
	{
		treelink r1=new treelink(5,null,null);

		treelink l2=new treelink(1,null,null);
		treelink lc=new treelink(3,null,null);


		treelink l1=new treelink(2,l2,lc);

		treelink root=new treelink(4,l1,r1);
		doubleeachnode(root);
		treenode t=new treenode();
		t.displaytree(root);
	}
    public static void doubleeachnode(treelink root)
    {
    	if(root==null)
    		return;
    	doubleeachnode(root.left);
    	doubleeachnode(root.right);
    	 
    	treelink oldnode=root.left;
    	root.left= new treelink(root.data,null,null);
    	root.left.left=oldnode;
    	
    }
}
