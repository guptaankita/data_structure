package treesngraphs;

public class checkmirrorimage {
 //program to check whether two trees are mirror images
	public static void main(String[] args)
	{
		treelink r1=new treelink(5,null,null);

		treelink l2=new treelink(1,null,null);
		treelink lc=new treelink(3,null,null);


		treelink l1=new treelink(2,l2,lc);

		treelink root=new treelink(4,l1,r1);
		
		treenode t=new treenode();

		//treelink rt1=new treelink(5,null,null);

		treelink lt2=new treelink(1,null,null);
		treelink ltc=new treelink(3,null,null);


		treelink lt1=new treelink(2,ltc,lt2);

		treelink root2=new treelink(4,null,lt1);
		boolean r=checkmirrorimage(root,root2);
		System.out.println(r);
        
		
	}
	public static boolean checkmirrorimage(treelink t1, treelink t2)
	{
		if(t1==null && t2==null)
			return true;
		if(t1==null || t2==null)
			return false;
		return ((t1.data==t2.data) && (checkmirrorimage(t1.left,t2.right)) 
				&& (checkmirrorimage(t1.right,t2.left)));
	}
}
