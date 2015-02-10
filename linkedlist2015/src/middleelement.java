
public class middleelement {

	//program to find middle element of linked list
	
	//Move one pointer by one and other pointer by two. 
	//When the fast pointer reaches end slow pointer will reach middle of the linked list.
	public static void main(String args[])
	{   link node5 = new link(40,null);
		link node4 = new link (25,node5);
		link node3 = new link(20, node4);
		link node2 = new link(8, node3);
		link node1 = new link(5,node2);
		link head = new link (10,node1);
		
		link slow = head;
		link fast = head;
		if(head!=null)
		{
		while(fast!=null && fast.next!= null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		}
		System.out.println("the middle element is:"+ slow.element);
		//another method
		
		//Initialize mid element as head and initialize a counter as 0. 
		//Traverse the list from head, while traversing increment the counter and change mid to mid->next whenever the counter is odd. 
		//So the mid will move only half of the total length of the list.
		int count =0;
		link mid = head;
				while(head!=null)
				{
					if(count%2!=0)
						mid = mid.next;
					
					++count;
					head = head.next;
				}
				if(mid!=null)
					System.out.println("middle element:"+ mid.element);
	}
}
