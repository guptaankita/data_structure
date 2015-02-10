
public class triangularnumber {

 public static void main(String[] args)
 {
	 int n=4;
	 int r=triangle(n);
 }
 
 public static int triangle(int k)
 { System.out.println("Entering k=::"+k );
	 if(k==1)
		 return 1;
	 int temp=k+triangle(k-1);
	 System.out.println("Returning:"+ temp);
	 return temp;
 }
}
