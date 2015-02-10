package treesngraphs;

import treesngraphs.createtree.tree;

public class treeclass { 
	public static void main(String[] args)
	{
		createtree t= new createtree();
		createtree t1= new createtree();
		t.binaryinsert(10);
		//t.binaryinsert(20);
		t1.binaryinsert(10);
		t1.binaryinsert(20);

		
	
		t.root.display();
		int a=sizetree(t.root);
		System.out.println(a);
		boolean r= identicaltree(t.root,t1.root);
		System.out.println(r);
	}
	
	public static int sizetree(tree root)
	{   //program to print size of the tree.
		if(root==null)
			return 0;
		return sizetree(root.left)+1+sizetree(root.right);
		
	}
	
	public static boolean identicaltree(tree t1, tree t2)
	{
		if(t1==null && t2==null)
			return true;
		else if((t1==null)&&(t2!=null)||(t1!=null)&&(t2==null))
			return false;
		else if(t1!=null && t2!=null)
		{
			return((t1.data==t2.data)&&
				identicaltree(t1.left,t2.left)&&
			    identicaltree(t1.right,t2.right));
		
			
		}
		return false;
	}
}
	class createtree{
	 
	class tree{
		int data;
		tree left;
		tree right;
		
		public void display()
		{
			System.out.println(data);
				}
	}
 
	tree root;
	public createtree(){
		root=null;
	}
	public void binaryinsert(int value)
	{
		tree newnode=new tree();
		newnode.data=value;
		if(root==null)
			root=newnode;
		else
		{
			tree current=root;
			tree parent;
			while(true)
			{
				parent=current;
				if(value<current.data)
				{
					current=current.left;
					if(current==null)
					{
						parent.left=newnode;
						return;
					}
				}
				else
				{
					current=current.right;
					if(current==null)
					{
						parent.right=newnode;
						return;
				
				
					}
				}
			}
		}
	}
}