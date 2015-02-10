
public class addtwoll {
  
	//program to add two linked list and return the sum as a linked list
	public static void main(String[] args)
	{
		linkedlistint l1=new linkedlistint();
		l1.insertatfirst(6);
		l1.insertatfirst(1);
		l1.insertatfirst(7);
		linkedlistint l2=new linkedlistint();
		l2.insertatfirst(2);
		l2.insertatfirst(9);
		//l2.insertatfirst(5);
		linkint r=addlist(l1.head,l2.head,0);
		while(r!=null)
		{
			System.out.println(r.data);
			r=r.next;
		}
	}
	
	public static linkint addlist(linkint l1,linkint l2,int carry)
	{
		if(l1==null && l2==null && carry==0)
			return null;
		
		linkint result=new linkint(carry,null);
		int value=carry;
		if(l1!=null)
		{
			value+=l1.data;
		}
		if(l2!=null)
		{
			value+=l2.data;
		}
		result.data=value%10;
		//recurse
		if(l1!=null || l2!=null)
		{
			 linkint more= addlist(l1==null?null:l1.next,
					            l2==null?null:l2.next,
					            value>=10?1:0);
			 result.next=more;
		}
		return result;
	}
}
