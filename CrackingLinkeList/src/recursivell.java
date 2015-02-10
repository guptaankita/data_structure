
public class recursivell {
// program to print reverse of a linked list recursively
	public static void main(String[] args)
	{
		linkedlistint l = new linkedlistint();
		l.insertatfirst(1);
		l.insertatfirst(2);
		l.insertatfirst(3);
		l.insertatfirst(4);
		l.insertatfirst(5);
		l.insertatfirst(6);
		l.display();
        reverselinkedlist(l.head);
	}
	
	public static void reverselinkedlist(linkint head)
	{
		if(head==null)
			return;
		reverselinkedlist(head.next);
		System.out.println(head.data);
	}
}
