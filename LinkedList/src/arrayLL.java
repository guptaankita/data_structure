
public class arrayLL {
	public static void main(String[] args){
		
	
	Alist ac= new Alist(10);
	ac.insert(8);
	}
	

}

class Alist{
	private static final int defaultsize=10;
	private int max;
	private int lsize;
	private int curr;
	private int[] lista;
	Alist(){
		this(defaultsize);
	}
	public Alist(int size) {
		max=size;
		lsize=curr=0;
		lista=new int[size];
	}
	
	public void clear(){
		lsize=curr=0;
	}
	
	public void insert(int it)
	{
		assert lsize<max : "list capacity exceeded";
		int i;
		for(i=lsize;i<curr;i--)
			lista[i]=lista[i-1];
		lista[curr]=it;
		lsize++;
	}
	public void append(int it)
	{
		assert lsize<max : "list capacity exceeded";
		lista[lsize++]=it;
	}
	
	public int remove()
	{
		if((curr<=0)&&(curr>=max))
			return (Integer) null;
		int it=lista[curr];
		int i;
		for(i=curr;i<lsize-1;i++)
			lista[i]=lista[i+1];
		lsize--;
		return it;
		
			
	}
	public void movetostart(){
		curr=0;
		
	}
	
	public void movetoend(){
		curr=lsize;
	}
	
	public void prev(){
		if(curr!=0)
			curr--;
	}
	
	public void next(){
		if(curr<lsize)
			curr++;
		
	}
}


