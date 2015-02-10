
public class queuearray {

}
 class aqueue{
	 private static final int dsize=10;
	 private int maxsize;
	 private int front;
	 private int rear;
	 private int[] qarray;
	 
	 aqueue(){
		 this(dsize);
	 }

	public aqueue(int size) {
		maxsize=size+1;
		rear=0;
		front=1;
		qarray=new int[size+1];
	}
	
	public void clear(){
		rear=0;
		front=1;
	}
	public void enqueue(int it){
		assert((rear+2)%maxsize)!=front :"queue is full";
		rear=((rear+1)%maxsize);
		qarray[rear]=it;
	}
	
	public int dequeue(){
		int it=qarray[front];
		front=((front-1)%maxsize);
		return it;
	}
	
	public int size(){
		if(rear>=front)
			return rear-front+1;
		else
			return (maxsize-front)+(rear+1);
	}
	
 }