import java.util.Scanner;


public class nthnodefromend {
 //program to find the nth node from the end of the linked list
	
	public static void main(String []args)
	{
		link node5 = new link(40,null);
		link node4 = new link (25,node5);
		link node3 = new link(20, node4);
		link node2 = new link(8, node3);
		link node1 = new link(5,node2);
		link head = new link (10,node1);
		int count =0;
		Scanner in  = new Scanner(System.in);
		System.out.println("enter N");
		int n = in.nextInt();
      //initialise two pointers with the head. first Move the reference pointer
	  // to the n nodes from head. now move both the pointers untill reference pointer
		// reaches the end, then the main pointer gives the nth node from the end.
		
		link ref = head;
		link main = head;
		
		if(head!=null)
		{
			while(count<n)
			{
				if(ref == null)
				{	System.out.println("N is greater than the nodes in the list");
				    return;//specify return here as now we don't ish to go any further
				    //down the while loop
				}
				ref = ref.next;
				count++;
				
			}
		}
		while(ref!=null)
		{
			ref = ref.next;
			main = main.next;
		}
		System.out.println("the N element is:"+ main.element);
	}
}
