
public class stackarray {
    public static void main(String[] args){
    	stackx s=new stackx(10);
    	s.push('a');
    	s.push('t');
    	while(!s.isempty())
    	{
    		System.out.println(s.pop());
    	}
    	
    	char f=s.peek();
    	System.out.println(f);
    }
}

class stackx{
	private int maxsize;
	private char sarray[];
	private int top;
	public stackx(int size)
	{
		maxsize=size;
		sarray=new char[maxsize];
		top=-1;
	
	}
	public void push(char it)
	{
		sarray[++top]=it;
	}
	
	public char pop(){
		return sarray[top--];
	}
	
	/**
	 * @return
	 */
	public char peek(){
		if(top!=-1)
		return sarray[top];
		else 
			return (Character) null;
	}
	
	public boolean isempty(){
		return (top==-1);
	}
	public boolean isfull(){
		return (top==maxsize-1);
	}
}