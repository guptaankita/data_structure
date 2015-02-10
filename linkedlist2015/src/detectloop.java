
public class detectloop {
	public static void main(String []args)
	{
		link node5 = new link(40,null);
		link node4 = new link (25,node5);
		link node3 = new link(20, node4);
		link node2 = new link(8, node3);
		link node1 = new link(5,node2);
		link head = new link (10,node1);
		//Floyd’s Cycle-Finding Algorithm: This is the fastest method. 
		//Traverse linked list using two pointers.  Move one pointer by one and other pointer by two.  
		//If these pointers meet at some node then there is a loop.  
		//If pointers do not meet then linked list doesn’t have loop.
		link slow = head;
		link fast = head;
		while(fast!=null && slow!= null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow.equals(fast))
			{
				System.out.println("loop found");
				return;
			}
		}
	}
	
}
