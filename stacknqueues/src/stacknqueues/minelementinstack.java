package stacknqueues;

class minelement
{
	int value;
	int min;
	public minelement(int v,int m)
	{
		value=value;
		min=m;
		
	}
}

public class minelementinstack {
	//program to find minimum element in constant time in a stack;
	static Stackx s= new Stackx(10);
   public static void main(String[] args)
   {
	    
        push(5);
       
   }
   
   public static void push(int value)
   {
	   if(s.top==-1)
	   {
		   s.push(new minelement(value,value));
		   
	   }
	   else
	   {
		   minelement e= s.peek();
		   if(e.min>value)
			   s.push(new minelement(value,value));
		   else
			   s.push(new minelement(value,e.min));
	   }
   }
}
