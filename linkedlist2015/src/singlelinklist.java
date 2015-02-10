class link{
	int element;
	link next;
	
	public link(int e, link n)
	{
		element = e;
		next = n;
	}
}


public class singlelinklist {
	link head;
	
	public singlelinklist()
	{
		head = null;
	}
    
	public boolean isEmpty()
	{
		return (head==null);
	}
	
	public void insertatfirst(int element){
		link newlink = new link(element, null);
		if(head != null)
		{
			newlink.next = head;
		}
		head = newlink;
	}
	//add a node after the given node
	public void insertafter(int element, link previous)
	{
		link newlink = new link(element, null);
		if(previous == null)
			return;
		newlink.next = previous.next;
		previous.next = newlink;//Time complexity of insertAfter() is O(1) as it does constant amount of work.
		
		
	}
	public void insertlast(int element)//Time complexity of append is O(n) where n is the number of nodes in linked list. 
	//Since there is a loop from head to end, the function does O(n) work.
	{   link newlink = new link( element,null);
		if(head == null)
		   head = newlink;
		link current = head;
		while(current.next != null)
		{
			current = current.next;
		}
		current.next = newlink;
	}
	
	public int deletfirst(){
		if(head == null)
			return -1;
		else{
		int temp = head.element;
		head = head.next;
		return temp;
		}
		
	}
	public link find(int key){
		link cur = head;
		while(cur.element != key && cur !=null)
		{
			cur = cur.next;
		}
		if(cur != null)
			return cur;
		else
			return null;
	}
	
	public link deletespecific(int key)// take into consideration the head element also
	{
		link cur = head;
		link pre = head;
		while(cur.element != key && cur != null)
		{
			pre = cur;
			cur = cur.next;
		}
		if(cur == head)
			{head = head.next;
			return cur;
			}
		else if(cur == null)
			return null;
		else
		{   link temp = cur;
			pre.next = cur.next;
			return temp;
		}
	}
	//delete last node
	public void deletelast()
	{   if (head==null)
		  return;
	if(head.next==null)
		head = null;
		link cur = head;
		while(cur.next.next!=null)
		{
			cur = cur.next;
		}
		cur.next = null;
	}
	
}
