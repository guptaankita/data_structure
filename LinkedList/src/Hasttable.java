
public class Hasttable {

	
	//this class uses linear probing technique to resolve collision
	
	private static final int tablesize=128;

	
		Hashentry[] table;
		Hasttable(){
			table=new Hashentry[tablesize];
			for(int i=0;i<tablesize;i++)
				table[i]=null;
		}
		
		public int get(int key)
		{ int hash= (key% tablesize);
		  while(table[hash]!=null && table[hash].getKey()!=key)
			  hash=(hash+1)%tablesize;
		  if(table[hash]==null)
			  return -1;
		  else
			  return table[hash].getValue();
			
		}
		
		
		public void put(int key,int value)
		{
			int hash= (key%tablesize);
			while(table[hash]!=null&&table[hash].getKey()!=key)
				hash=(hash+1)%tablesize;
			table[hash]=new Hashentry(key,value);
		}
		
		public int remove(int key)
		{    
			int i=get(key);
			if(i==-1)
			{
				System.out.println("no such element exists");
				return -1;
			}
			else
			{
				for(int j=i;j<table.length;j++)
					table[j]=table[j+1];
			
				return table[i].getValue();
				
				
			}
		}
	}



class Hashentry{
	private int key;
	private int value;
	 
	public Hashentry(int key, int value)
	{
		this.key=key;
		this.value=value;
	}
	
	public int getKey(){
		return key;
	}
	
	public int getValue(){
		return value;
	}
}