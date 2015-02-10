
public class middleelement {
	//program to print middle element of a linked list
	public static void main(String[] args)
	{
		linkedlistint l = new linkedlistint();
		l.insertatfirst(1);
		l.insertatfirst(2);
		l.insertatfirst(3);
		l.insertatfirst(4);
		l.insertatfirst(5);
		l.insertatfirst(9);
		l.insertatfirst(5);

		

	
	 int k= findmiddleelement(l.head);
	 System.out.println(k);
	 

}
   
  
public static int findmiddleelement(linkint l)
  {   linkint current=l;
      linkint runner=l;
      if(l==null)
    	  return (Integer) null;
	  while(current!=null&& current.next!=null)
	  {
		  current=current.next.next;
		  runner=runner.next;
	  }
	  return runner.data;
  }
}