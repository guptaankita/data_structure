class linkint{
		int data; 
		linkint next;
		public linkint(int d, linkint l)
		{
			data=d;
			next=l;
		}
	}





public class linkedlistint {

	 //singly linked list with just one pointer
		linkint head;
		public linkedlistint()
		{
			head=null;
		}
		
		boolean isEmpty()
		{
			return(head==null);
		}
		
		public void insertatfirst(int v)
		{
			linkint newlink=new linkint(v,null);
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
			linkint cur=head;
			while(cur!=null)
			{
				System.out.println(cur.data);
				cur=cur.next;
			}
		}
		
		public linkint find(int k)
		{
			linkint current=head;
			while(current!=null && current.data!=k)
			{
				current=current.next;
			}
			if(current!=null)
				return current;
			else
				return null;
		}
		
	/*	public linkint deletespecific(int key)
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
		}*/
	}



