import java.util.Stack;


public class reverseaword {
	public static void main(String[] args)
	{
	String word="home";
	char a[]=new char[10];
	Stack s=new Stack();
	char b[]=new char[10];
	String output="";
	 
	for(int i=0;i<word.length();i++)
	{
		a[i]=word.charAt(i);
	}
int len=a.length;
for(int i=0;i<len;i++){
	s.push(a[i]);
	System.out.println(a[i]);
}

int k=0;
while(!s.empty())
{ 
	b[k]=(char)s.pop();
	output=output+b[k];
	k++;
}
System.out.println(output);
	}
}
