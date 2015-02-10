package treesngraphs;

public class levelofanode {
	//given a node find its level
	public static void main(String[] args)
	{
		treelink r1=new treelink(5,null,null);

		treelink l2=new treelink(1,null,null);
		treelink lc=new treelink(3,null,null);


		treelink l1=new treelink(2,l2,lc);

		treelink root=new treelink(4,l1,r1);
		int r=findlevel(root,5,1);
		System.out.println(r);
		
	}
  public static int findlevel(treelink root,int k,int level)
  {
	  if(root==null)
		  return 0;
	  if(root.data==k)
		  return level;
	  
	  int leftd=findlevel(root.left ,k,level+1);
	  if(leftd!=0)
		  return leftd;
	  int rightd=findlevel(root.right,k,level+1);
	  return rightd;
	  
  }

}
