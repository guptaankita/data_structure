
public class deletealternate {
//program to delete alternate nodes from a linked list
	public static void main(String[] args)
	{
		linkedlistint l1=new linkedlistint();
		l1.insertatfirst(1);
		l1.insertatfirst(2);
		l1.insertatfirst(3);
		deletealternate(l1.head); 

	}
	public static void deletealternate(linkint head)
	{
		linkint previous=head;
		linkint current=head.next;
		while(current!=null && previous!=null)
		{
			previous.next=current.next;
			previous=previous.next;
			if(previous!=null)
				current=previous.next;
		}
		
		linkint curr=head;
	}
}
