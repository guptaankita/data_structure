
public class Ispalindrome {

	//method 1
	//choose a stack or hash map but requires O(n) space or O(n) time
	
	//method 2
	//find out the middle element
	//create two list
	//reverse the second list
	//compare both the halfs
	//reverse the second half again 
	//combine both the halfs
	public static void main(String[] args)
	{
		link node5 = new link(40,null);
		link node4 = new link (25,node5);
		link node3 = new link(20, node4);
		link node2 = new link(8, node3);
		link node1 = new link(5,node2);
		link head = new link (10,node1);
		link fast = head;
		link slow= head;
		link mid=null;
		link prev_of_slow=null;
		while(fast!=null && fast.next!=null)
		{
			prev_of_slow = slow;
			slow=slow.next;
			fast=fast.next;
		}
		if(fast!=null)
		{
			mid=slow;
			slow = slow.next;
		}
		//here we have to consider 2 cases
		//if list has odd no of elements then fast!=null
		//else if list has even no then fast==null;
		
		
		//now reverse the list
		link revslow = reverse(slow);
		boolean isPalindrome = compare(head,revslow);
		link slow1 = reverse(revslow);
		if(mid!=null)
		{
			prev_of_slow.next = mid;
			mid.next=slow1;
			
		}
		else
			prev_of_slow.next = slow1;
	}
	static boolean compare(link temp1,link temp2)
	{  
	 while(temp1!=null && temp2!=null)
	 {
		 if(temp1.element==temp2.element)
		 {
			 temp1=temp1.next;
			 temp2=temp2.next;
		 }
		 else
			 return false;
	 }
	 if(temp1==null && temp2 ==null)
			return true;
	 return false;///it will come here when either one of the list is null but not both
	}
	static link reverse(link slow){
		if(slow==null || slow.next==null)
			return null;
		link sec = slow.next;
		link third = sec.next;
		sec.next = slow;
		slow = null;
		link cur = third;
		link prev = sec;
		link next = null;
		if(third!=null)
		{
			while(cur!=null)
			{
				next = cur.next;
				cur.next = prev;
				prev = cur;
				cur = next;
			}
			slow = prev;
		}
		return null;
		}
}