package stacknqueues;

public class arraytostack {
  //program to make 3 stacks from a single array
	static int stacksize=10;
	static int[] buffer=new int[3*stacksize];
	static int[] stacktop= new int[]{-1,-1,-1};

	public static void main(String[] args) throws Exception
	{
		push(3,10);
		pop(3);
		peek(3);
		
	}
	public static void push(int stacknum,int value) throws Exception
	{
		int top=stacktop[stacknum];
		if(top+1>=stacksize)
		{	throw new Exception("Stack full");
		}
		stacktop[stacknum]++;
		buffer[abs(stacknum)]=value;
	}
	
	public static int pop(int stacknum) throws Exception
	{
		if(stacktop[stacknum]==-1)
			throw new Exception("stack empty");
		
		int value=buffer[abs(stacknum)];
		buffer[abs(stacknum)]=0;
		stacktop[stacknum]--;
		return value;
	}
		
	public static int peek(int stacknum)
	{
		if(stacktop[stacknum]==-1)
			return (Integer) null;
		
		int top=abs(stacknum);
		return top;
		
	}

	public static int abs(int stacknum)
	{
		return stacknum*stacksize + stacktop[stacknum];
	}
	}

