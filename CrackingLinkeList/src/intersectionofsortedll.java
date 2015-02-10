import java.util.Hashtable;


public class intersectionofsortedll {
 // program to find intersection between sorted linked list
	public static void main(String[] args)
	{
		linkedlistint l1=new linkedlistint();
		l1.insertatfirst(1);
		l1.insertatfirst(2);
		l1.insertatfirst(3);
		linkedlistint l2=new linkedlistint();
		l2.insertatfirst(1);
		l2.insertatfirst(2);
		l2.insertatfirst(4);
		linkedlistint r=intersect(l1.head,l2.head);
		linkint top=r.head;
		while(top!=null)
		{
			System.out.println(top.data);
			top=top.next;
		}
        linkint y=  recursiveintersect(l1.head,l2.head);//recursively determine the intersection in ll
        linkint tp=y;
		while(tp!=null)
		{
			System.out.println(tp.data);
			tp=tp.next;
		}
       
	}
	
	public static linkedlistint intersect(linkint l1, linkint l2)
	{
		Hashtable map=new Hashtable();
		linkint current=l1;
		while(current!=null)
		{
			map.put(current.data, true);
			current=current.next;
		}
		linkint newcurr=l2;
		linkedlistint result=new linkedlistint();
		
		while(newcurr!=null)
		{
			if(map.containsKey(newcurr.data))
			{
						result.insertatfirst(newcurr.data);
						
			}
			newcurr=newcurr.next;
		}
		
		
		return result;
	} 
	
	public static linkint recursiveintersect(linkint l1, linkint l2)
	{
		if(l1==null || l2==null)
			return null;
		if(l1.data<l2.data)
			return recursiveintersect(l1.next,l2);
		if(l2.data<l1.data)
		return	recursiveintersect(l1,l2.next);
		
	
		linkint result=new linkint(l1.data,null);
		
		result.next=recursiveintersect(l1.next,l2.next);
		
		return result;
		
	}
}
