package treesngraphs;

public class printpath {
 
	//given a binary tree,print all its root-to-leaf path, one per line
	public static void main(String[] args)
	{
		treelink r1=new treelink(5,null,null);

		treelink l2=new treelink(1,null,null);
		treelink lc=new treelink(3,null,null);


		treelink l1=new treelink(2,l2,lc);

		treelink root=new treelink(4,l1,r1);
		int[] path=new int[100];
		printallpaths(root,path,0);

	}
	
	public static void printallpaths(treelink root, int[] path,int pathlength)
	{
		if(root==null)
			return;
		path[pathlength++]=root.data;
		
		if(root.left==null && root.right==null)
		{
			printpath(path,pathlength);
			
		}
		
		else
		{
			printallpaths(root.left,path,pathlength);
			printallpaths(root.right,path,pathlength);
		}
	}
	
	public static void printpath(int[] path, int len) 
	{   
		System.out.println("new path");
		for(int i=0;i<len;i++)
			System.out.println(path[i]);
		
	}
}
