
public class detectloop {
//program to detect loop in a linkedlist
	public static void main(String[] args)
	{
		linkedlistint l = new linkedlistint();
		linkint l4= new linkint(2,null );

		linkint l3= new linkint(3,l4);

		linkint l2= new linkint(2,l3);

		linkint head=new linkint(1,l2);
		//l4.next=l3;
		boolean r=detectloopinll(head);
		System.out.println(r);
		

	}
	 
	public static boolean detectloopinll(linkint head)
	{
		if(head==null || head.next==null)
			return false;
		
		linkint current=head;
		linkint runner=head;
		while(current!=null && runner!=null && current.next!=null)
		{  
			
			runner=runner.next;
			current=current.next.next;
			if(runner==current)
				return true;
			
		}
		return false;
	}
	
}
