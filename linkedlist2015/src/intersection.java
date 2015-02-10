
public class intersection {
 //get the count of node in first list
// get the count of node in second list
// get the difference d of both the nodes
// increment the longer node till d
// traverse both nodes together now

	public static void main(String[] args)
	{
		link node5 = new link(40,null);
		link node4 = new link (25,node5);
		link node3 = new link(20, node4);
		link node2 = new link(8, node3);
		link node1 = new link(5,node2);
		link head1 = new link (10,node1);
		
// second list
		link head21 = new link (10,node4);

		int l1=0;
		int l2=0;
		int d=0;
		int intersection = -1;
		link cur1=head1;
		link cur2=head21;
		while(cur1!=null)
		{
			l1++;
			cur1=cur1.next;
		}
		while(cur2!=null)
		{
			l2++;
			cur2=cur2.next;
		}
		if(l1>l2)
			{d=l1-l2;
			 intersection = getintersection(d,head1,head21);
			}
			
		else 
		{	d=l2-l1;
		   intersection=  getintersection(d,head21,head1);
		}
		
		System.out.println(intersection);
	}
	
	static int getintersection(int d, link head1,link head2)
	{
		link cur1= head1;
		link cur2=head2;
		for(int i=0;i<d;i++)
		{
			if(cur1==null)
				return -1;
			cur1=cur1.next;
		}
		while(cur1!=null && cur2!=null)
		{
			if(cur1.element==cur2.element)
				return cur1.element;
			cur1=cur1.next;
			cur2=cur2.next;
		}
		return -1;
	}
}
