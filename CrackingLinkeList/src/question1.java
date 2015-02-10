import java.util.*;


public class question1 {
 public static void main(String[] args)
 {
	 Scanner n=new Scanner(System.in);
	 String input=n.nextLine();
	 int len=input.length();
	 int j=0;
	 char[] a=new char[len];
	 for(int i=0;i<len;i++)
	 {
		 if(input.charAt(i)!=' ')
		 { a[j]=input.charAt(i);
		    j++;
		 }
	 }
	  linkedlist l= new linkedlist();
	for(int i=0;i<a.length;i++)
		l.insertfirst(a[i]);
	
	l.display();
	
	  question1 q=new question1();
	  q.deletedups(l);
	  q.deletehash(l);
	 }

private void deletehash(linkedlist l) {
	Hashtable t= new Hashtable();
	node previous = new node(null);
			while(l.curr!=null)
			{
				if(t.containsKey(l.curr.data))
				{
					previous.next=l.curr.next;
				}
				else
				{
					t.put(l.curr.data,true);
					previous=l.curr;
				
					
				}
				l.curr=l.curr.next;
			}
	System.out.println("hash table");
	l.display();
	
}

private void deletedups(linkedlist l) {
	if(l.head==null)
		return;
	node current=new node(l.head);
	while(current.next!=null)
	{
		node runner=current.next;
		while(runner.next!=null)
		{ if(runner.next.data==current.next.data)
			   runner.next=runner.next.next;
		else
			runner=runner.next;
		}
		current=current.next;
	}
	System.out.println("no buffer");
	l.display();
}
}
 
 class node
 {
	 char data;
	 node next;
	 node(char d, node nextval)
	 {
		 data=d;
		 next=nextval;
	 }
	 node(node nextval)
	 {
		 next=nextval;
	 }
	 
 }
 
 class linkedlist
 {
	 node head;
	 node tail;
	 node curr;
	 int c;
	 linkedlist(){
		 head=tail=curr= new node(null);
		 c=0;
	 }
	 
	 public void insert(char f)
	 {
		 node ne=new node( f, curr.next);
		 curr.next=head;
		 if(tail==curr)
			 tail=curr.next;
		 c++;
		 
	 }
	 public void insertfirst(char f)
	 {
		 node ne=new node( f, head);
		 head=ne;
	 }
	
	 public void append(char f)
	 {
		 node ne=new node(f,null);
		 tail.next=ne;
		 c++;
	 }
	 
	 public char remove()
	 {
		 if(curr.next==null)
			 return (Character) null;
		 char it= curr.next.data;
		 if(tail==curr.next)
			 tail=curr;
		 curr.next=curr.next.next;
		 c--;
		 return it;
	 }
	  public void display()
	  { 
		  node current=head;
		  while(current!=null)
		  {
			  System.out.println(current.data);
			  current=current.next;
		  }
	  }
 }
 
	
	
	

