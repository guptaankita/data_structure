
public class reverselist {
 //program to reverse a linked list
	static link head = null;
	public static void main(String []args)
	{
		link node5 = new link(40,null);
		link node4 = new link (25,node5);
		link node3 = new link(20, node4);
		link node2 = new link(8, node3);
		link node1 = new link(5,node2);
		 head = new link (10,node1);
		
		if(head==null || head.next==null)//if list empty or only one element in list
			return;
		link second = head.next;
		link third = second.next;
		second.next = head;
		head.next = null;
		if(third == null)
			return;
	
			link previous = second;
			link current =  third;
			while(current!=null)
			{
				link next = current.next;
				current.next = previous;
				previous = current;
				current = next;
				
			}
			head = previous;
		
		//using recursive method for reversal
			recursivereverse(head);
	}

	 static void recursivereverse(link current) {
		if(current==null)
			return;
		if(current.next==null)
		{
			head=current;
			return;
		}
		
		recursivereverse(current.next);
		current.next.next = current;
		current.next = null;//set old next pointer to null
	}
}
