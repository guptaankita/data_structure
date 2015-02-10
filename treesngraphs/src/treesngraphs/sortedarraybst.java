package treesngraphs;

import java.util.Scanner;

import treesngraphs.createtree.tree;

public class sortedarraybst {
	//given a sorted array,creating a BST out of this sorted array
	// always remember to put base case in recursion, otherwise the program will fail;
	public static void main(String[] args)
	{
	int[] a=new int[10];
	Scanner n=new Scanner(System.in);
	System.out.println("enter elements");
	int len=10;
	int[] arr=new int[len];
	for(int i=0;i<10;i++)
	{
		a[i]=n.nextInt();
	}
	
	tree t=createbstfromarray(a,0,a.length-1);
	System.out.println(t.data);
	displaybst(t,arr,0);	
}
	
	public static void displaybst(tree t, int[] path,int len)
	{
		if(t==null)
			return;
		path[len++]=t.data;
		if(t.left==null&&t.right==null)
		{
			for(int i=0;i<len;i++)
				System.out.println(path[i]);
		}
		else
		{
			displaybst(t.left,path,len);
			displaybst(t.right,path,len);
		}
	}
	public static tree createbstfromarray(int[] a, int start, int end)
	{
		if(end<start)
			return null;
		createtree t=new createtree();
		int mid=(start+end)/2;
		t.binaryinsert(a[mid]);
		t.root.left=createbstfromarray(a,start,mid-1);
		t.root.right=createbstfromarray(a,mid+1,end);
		return t.root;
	}
}