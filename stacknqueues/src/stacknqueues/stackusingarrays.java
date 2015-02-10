package stacknqueues;


public class stackusingarrays {
		//stack implementation using an array
		public static void main(String[] args)
		{   String input= "reverse";
		    int l=input.length(),i=0;
		    char[] arr=new char[l];
		    Stackx s= new Stackx(l);
		    for( i=0;i<l;i++)
		    {
		    	char c=input.charAt(i);
		    	s.push(c);
		    }
		    i=0;
		    while(!s.isEmpty())
		    {
		    	arr[i++]=s.pop();
		    }
			System.out.println("reverse string:  "+ new String(arr));
		}
	}
		
		class Stackx{
		int maxsize;
		char[] Stack;
		int top;
		public Stackx(int size)
		{ maxsize=size;
		  Stack=new char[maxsize];
		  top=-1;
		  
			
		}
		
		public void push(char a)
		{
			if(top!=(maxsize-1))
				Stack[++top]=a;
		}
		
		public char pop()
		{
			if(top==-1)
				return (Character) null;
			else
				return Stack[top--];
		}

		public char peek()
		{    
			if(top!=-1)
			return Stack[top];
			else
				return (Character) null;
		} 
		
		public boolean isEmpty()
		{
			return (top==-1);
		}
		
		public boolean isFull()
		{
			return (top==(maxsize-1));
		}
	}

	
	


