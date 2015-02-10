
public class deletemiddle {
	//program to delete a middle node in a linked list, given only access to this node
	public static void main(String[] args)
	{
		linkedlistchar l= new linkedlistchar();
		String s= "Follow up";
		char[] arr=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{   if(s.charAt(i)!=' ')
			arr[i]=s.charAt(i);
		else
			arr[i]=s.charAt(i+1);
		}
		
		
		
		for(int i=0;i<arr.length;i++)
			l.insertatfirst(arr[i]);
		link current=l.head;
		int count=0;
		while(count<4)
		{
			current=current.next;
			count++;
		}
		boolean r=deletenode(current);
		System.out.println(r);

	}
    public static boolean deletenode(link n)
    {
    	if(n==null||n.next==null)
    		return false;
    	link next=n.next;
    	n.data=next.data;
    	n.next=next.next;
    	return true;
    }
}
