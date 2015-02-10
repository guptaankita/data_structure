package sorting;

public class mergetwoarrays {

	// given two sorted arrays A and B  and A is enough buffer at end hold B
	//we start from the end of A so that we don't have to shift the element.
	public static void main(String[] args)
	{
		int[] A=new int[15];
		A[0]=1;
		A[1]=2;
		A[2]=3;
		A[3]=4;
		A[4]=5;
		int[] B= new int[]{6,7,8,9,10};
		int lastA=5;
		int lastB=5;
		merge(A,B,lastA,lastB);
	}
	public static void merge(int[] A, int[] B,int lastA,int lastB)
	{
	     int indexA=lastA-1;
	     int indexB=lastB-1;
	     int merged=lastA+lastB-1;
	     while(indexA>=0 && indexB>=0)
	     {
	    	 if(A[indexA]>B[indexB])
	    	 {
	    		 A[merged]=A[indexA];
	    		 merged--;
	    		 indexA--;
	    	 }
	    	 
	    	 else
	    		 
	    	 {
	    		 A[merged]=B[indexB];
	    		 merged--;
	    		 indexB--;
	    	 }
	     }
	     
	     while(indexB>=0)
	     {
    		 A[merged]=B[indexB];
    		 merged--;
    		 indexB--;

	     }
	
	for(int i=0;i<lastA+lastB;i++)
		System.out.println(A[i]);
	}	
}
