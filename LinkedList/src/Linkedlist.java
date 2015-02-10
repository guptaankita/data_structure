
public class Linkedlist {




class Link{
	int element;
	Link next;

	Link(int it, Link nextval)
	{
		element=it;
		next=nextval;
	}
	Link(Link nextval)
	{
		next=nextval;
	}
}

class LLink{
	Link head;
	Link tail;
	Link curr;
	int c;
	LLink(){
		tail=head=curr=new Link(null);
		c=0;
	}

	public void remove(){
		head.next=null;
		tail=head=curr=new Link(null);
		c=0;
	}
	
	public void insert(int it)
	{
		Link newlink= new Link(it,curr.next);
		curr.next=newlink;
		if(tail==curr)
			tail=curr.next;
		c++;
	}
	
	public void append(int it)
	{
		Link newtail= new Link(it,null);
		tail.next=newtail;
		tail=newtail;
	}
	
	public int removee()
	{
		if(curr.next==null)
			return (Integer) null;
		int it=curr.next.element;
		if(tail==curr.next)
			tail=curr;
		curr.next=curr.next.next;
		c--;
		return it;
		
	}
	
	public void prev()
	{
		if(curr==head) return;
		Link temp=head;
		while(temp.next!=curr)
		{
			temp=temp.next;
		}
		curr=temp;
		
	}
	
	public int currpos(){
		Link temp=head;
		int i;
		for(i=0;curr!=temp;i++)
			temp=temp.next;
		return i;
		
	}
		
	public Link find(int key)
	{
		Link current=head;
		while(current.element!=key)
		{
			if(current.next==null)
				return null;
			else
				current=current.next;
			
		}
		return current;
	}
		
		public Link delete(int key)
		{
			Link previous= head;
			Link current=head;
			while(current.element!=key)
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
				previous=current.next;
			return current;
			
		}
		
		//inserting in a sortedLL
		public void insertsorted(int key)
		{
			Link newlink=new Link(key,null);
			Link previous=null;
			Link current=head;
			while(current==null && key>current.element)
			{
				previous=current;
				current=current.next;
			}
			if(previous==null)
				head=newlink;
			else
				previous.next=newlink;
			newlink.next=current;
		}
}