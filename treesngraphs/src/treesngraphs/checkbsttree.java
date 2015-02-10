package treesngraphs;
import java.util.*;

import treesngraphs.createtree.tree;

public class checkbsttree {
	//program to check whether a binary tree is a BST
	public static int previsit=Integer.MIN_VALUE;

	public static void main(String[] args)
	{
	createtree t= new createtree();
	t.binaryinsert(10);
	t.binaryinsert(20);
	ifStree(t.root, Integer.MIN_VALUE,Integer.MAX_VALUE);
	preordercheck(t.root);
	}
	
	public static boolean preordercheck(tree root)
	{
		if(root==null)
			return true;
		if(!preordercheck(root.left))
			return false;
		if(root.data<=previsit)
			return false;
		if(!preordercheck(root.right))
			return false;
		
		return true;
	}
	
  public static boolean ifStree(tree root, int min, int max)
  {   //using min/max method
	  if(root==null)
		  return true;
	  if(root.data<=min || root.data>max)
		  return false;
	  
	  if((!ifStree(root.left,min,root.data))||(!ifStree(root.right,root.data,max)))
		  return false;
	  
	  return true;
  }
}
	
