
public class klastelement {
	
	// program to find kth element from the last of a linkedlist
	public static void main(String[] args)
	{
	linkedlistchar l= new linkedlistchar();
	String s= "gfedcba";
	char[] arr=new char[s.length()];
	for(int i=0;i<s.length();i++)
	{   if(s.charAt(i)!=' ')
		arr[i]=s.charAt(i);
	else
		arr[i]=s.charAt(i+1);
	}
	
	
	for(int i=0;i<arr.length;i++)
		l.insertatfirst(arr[i]);
    
	char c=findelement(l,1);
	if(c!='0')
    System.out.println(c);
	else
		System.out.println("no such element");
    
	}
	public static char findelement(linkedlistchar l, int k)
	{   int count=0;
		link current=l.head;
	while(count<k)
	{
		if(current.next==null)
			return (Character)null;
		current=current.next;
		count++;
	} 
	if(current==null)
		return (Character)null;
	
	link runner=l.head;
	while(current!=null)
	{
		current=current.next;
		runner=runner.next;
	}
     return runner.data;
	}
}
