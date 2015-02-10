import java.util.Scanner;


public class getNnode {

	//program to find the Nth node of the linked list
	//time complexity is O(n) as we are looping through the entrie 'n' elements .
	static link head;
	static link cur = head;
	static int count=0;
	static int N;
	public static void main(String args[])
	{
	Scanner in = new Scanner(System.in);
	N = in.nextInt();
	while(cur !=null || count != N)
	{
		cur = cur.next;
		count++;
	}
	if(cur==null)
		System.out.println("cannot find element N");
	else
	{
		System.out.println("The element at Nth position:"+ cur.element);	}
}
}
