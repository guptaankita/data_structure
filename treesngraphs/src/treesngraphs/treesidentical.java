package treesngraphs;

public class treesidentical {
//program to find if two trees are identical;
	public static void main(String[] args)
	{   
		treelink r1=new treelink(60,null,null);

		treelink l2=new treelink(20,null,null);

		treelink l1=new treelink(40,l2,null);

		treelink root=new treelink(100,l1,r1);
		
		
		treelink rt1=new treelink(60,null,null);

		treelink lt2=new treelink(20,null,null);

		treelink lt1=new treelink(40,lt2,null);

		treelink root2=new treelink(200,lt1,rt1);
	boolean r=	checkidentical(root,root2);
	System.out.println(r);

	}
	
	public static boolean checkidentical(treelink r1, treelink r2)
	{
		if(r1==null && r2==null)
			return true;
		if(r1!=null && r2==null)
			return false;
		if(r1==null && r2!=null)
			return false;
		
		if(r1!=null && r2!=null)
		{
			if(r1.data==r2.data)
				return ((checkidentical(r1.left,r2.left)) && (checkidentical(r1.right,r2.right)));
		}
		   
			return false;
		
		
	}

}
