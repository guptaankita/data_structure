class link{
	int data; 
	link next;
	public link(int d, link l)
	{
		data=d;
		next=l;
	}
}


public class linkedhead {
 //singly linked list with just one pointer
	link head;
	public linkedhead()
	{
		head=null;
	}
	
	boolean isEmpty()
	{
		return(head==null);
	}
	
	public void insertatfirst(int v)
	{
		link newlink=new link(v,null);
		if(head!=null)
		{
			newlink.next=head;
		}
		head=newlink;
	}
	
	public int deleteatfirst()
	{
		if(head==null)
			return -1;
		else
		{
			int v=head.data;
			head=head.next;
			return v;
		}
	}
	
	public void display()
	{
		link cur=head;
		while(cur!=null)
		{
			System.out.println(cur.data);
			cur=cur.next;
		}
	}
	
	public link find(int k)
	{
		link current=head;
		while(current!=null && current.data!=k)
		{
			current=current.next;
		}
		if(current!=null)
			return current;
		else
			return null;
	}
	
	public link deletespecific(int key)
	{
		link current=head;
		link previous = null;
		while(current.data!=key)
		{
			if(current.next==null)
				return null;
			else
			{
			previous=current;
			current=current.next;
			}
		}
		if(current==head)
			head=head.next;
		else
		previous.next=current.next;
		return current;
	}
}
