
	class link{
		char data; 
		link next;
		public link(char d, link l)
		{
			data=d;
			next=l;
		}
	}




public class linkedlistchar {
    

	 //singly linked list with just one pointer
		link head;
		public linkedlistchar()
		{
			head=null;
		}
		
		boolean isEmpty()
		{
			return(head==null);
		}
		
		public void insertatfirst(char v)
		{
			link newlink=new link(v,null);
			if(head!=null)
			{
				newlink.next=head;
			}
			head=newlink;
		}
		
		public char deleteatfirst()
		{
			if(head==null)
				return (Character)null;
			else
			{
				char v=head.data;
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
		
		public link find(char k)
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
		
		public link deletespecific(char key)
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

	

