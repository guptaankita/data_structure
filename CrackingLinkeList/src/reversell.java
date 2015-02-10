
public class reversell {
	//program to reverse a linked list
	public static void main(String[] args)
	{
		linkedlistint l = new linkedlistint();
		l.insertatfirst(1);
		l.insertatfirst(2);
		l.insertatfirst(3);
		l.insertatfirst(4);
		l.insertatfirst(5);
		l.insertatfirst(6);
		linkint k=l.head;
		while(k!=null)
		{
			System.out.println(k.data);
			k=k.next;
		}
		reverselinkedlist(l.head);

	}
	public static void reverselinkedlist(linkint head)
	{
		if(head==null || head.next==null)
			return;
		linkint second=head.next;
		linkint third=second.next;
		second.next=head;
		head.next=null;
	  if(third==null)
		  return ;
	  linkint current=third;
	  linkint previous=second;
	  while(current!=null)
	  {    linkint next=current.next;    //need to keep track of the node next to current,because we chnge the current.next to previous
	                                   //it will make us again and again point to the same node;
		  current.next=previous;
		  previous=current;
		  current=next;
	  }
	  head=previous;  //important step to make the head point to the last element;
	
	linkint cur=head;
	while(cur!=null)
	{
		System.out.println(cur.data);
		cur=cur.next;
	}
	}
}
