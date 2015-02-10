import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;


public class removedupl {
	//program to remove duplicates from a unsorted linked list
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
		
		
		//Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
			l.insertatfirst(arr[i]);
		//method1(l); //to sort out duplicates in a linked list using sorted array
		//l.display();
		 // find duplicates using the runner method;
		method2(l);
		l.display();
	}
     
	public static void method1(linkedlistchar l)
	{  
		link current=l.head;
		link previous=null;
		while(current.next!=null)
		{
			if(current.data==current.next.data)
			{
				if(previous!=null)
					previous.next=current.next;
				else
				   previous=current.next;
			}
			
			else
			{
				previous=current;
			}
			current=current.next;

		}
	}
		

		
		public static void method2(linkedlistchar l)
		{
			if(l.head==null)
				return;
		    link current=l.head;
		    while(current!=null)
		    {  
		        link runner=current;
		    	while(runner.next!=null)
		    	{
		    		if(runner.next.data==current.data)
		    		{
		    			runner.next=runner.next.next;
		    		}
		    		else
		    			runner=runner.next;
		    	}
		    	current=current.next;
		    }
	  }
}
