package treesngraphs;

public class pathequalgivensum {
 //program to find root to leaf path equal to given sum
	public static void main(String[] args)
	{
		treelink r1=new treelink(5,null,null);

		treelink l2=new treelink(1,null,null);
		treelink lc=new treelink(3,null,null);


		treelink l1=new treelink(2,l2,lc);

		treelink root=new treelink(4,l1,r1);
		boolean r=findpath(root,10);
		System.out.println(r);
	}
	
	public static boolean findpath(treelink root, int sum)
	{
		if(root==null)
		{
			return (sum==0);
		}
		
		int subset=sum-root.data;
		
		if(subset==0 && root.left==null && root.right==null)
			return true;
		
		boolean ans=false;
		
		if(root.left!=null)
			ans=ans||findpath(root.left,subset);
		if(root.right!=null)
			ans=ans||findpath(root.right,subset);
		return ans;
	}

}
