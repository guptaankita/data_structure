
public class linkedhashtable {
 //hash table using a linked list
	//private nested class is used to implement the linked list
	private static class listnode{
		String key;
		String value;
		listnode next;
	}

	listnode[] table;
	int count;
	linkedhashtable(){
		table=new listnode[64];
	}
	
	void dump(){
		for(int i=0;i<table.length;i++)
		{
			listnode list=table[i];
					while(list!=null)
					{
						System.out.println(list.key+"    "+list.value);
						list=list.next;
					}
		}
	}
	
	public void put(String key,String value)
	{
		assert key!=null: "key cannot be null";
		int bucket=hash(key);
		listnode list=table[bucket];
		while(list!=null)
		{
			if(list.key.equals(key))
				break;
			list=list.next;
		}
		if(list!=null)
		   list.value=value;
		else
		{
			listnode n=new listnode();
			n.key=key;
			n.value=value;
			n.next=table[bucket];
			table[bucket]=n;
			count++;
		}
	}

	public String get(String key)
	{
		int bucket=hash(key);
		listnode list=table[bucket];
		while(list!=null)
		{
			if(list.key.equals(key))
				return list.value;
			list=list.next;
		}
		return null;
		
		
	}
	
	public void remove(String key)
	{
		int bucket=hash(key);
		if(table[bucket]==null)
			return;
		if(table[bucket].key.equals(key))
		{
			table[bucket]=table[bucket].next;
			count--;
			return;
			
		}
		
		listnode prev=table[bucket];
		listnode curr=prev.next;
		while(curr!=null && curr.key.equals(key))
		{
			curr=curr.next;
			prev=curr;
		}
		if(curr!=null)
		{
			prev.next=curr.next;
			count--;
		}
	}
	
	public boolean containskey(String key)
	{
		int bucket=hash(key);
		listnode list=table[bucket];
		while(list!=null)
		{
			if(list.key.equals(key))
				return true;
			list=list.next;
		}
		return false;
	}
	private int hash(String key) {
		
		return (Math.abs(key.hashCode()%table.length));
	}
}
