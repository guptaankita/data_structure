
public class findNumber {
	
	public static int findNumbers(int n){
		int l = 0; 
		int mul = 0 ; 
		boolean isPrintL = false; 
		for( l = 1; l< 100000; l++){
			mul = n * l;
			isPrintL = isPrintL(mul);
			if(isPrintL == true){
				
				break;
				
			}
			else{
				continue;
			}
			
			
		}
		return mul;
	}
	
	public static boolean isPrintL(int n){
		boolean x0 = false;
		boolean x1 = false;
		while(n > 0){
			
			if(n%10 == 0 || n%10==1){
				if(n%10 == 0)
				{
					x0 = true;
				}
				if(n%10 == 1)
						{
							x1 = true;
						}
				n = n/10;
			}
			else	return false;
		}
		return x0 && x1;
		
		
		
	}
	
	public static void main(String args[]){
		System.out.println(findNumbers(003));
	}
	

}
