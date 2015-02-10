
public class mult {
	
		public static void main(String[] args)
		
		{
			int sum=0,count=0;
			for(int i=1;i<=16;)
			{   
				sum+=i;
				count++;
				System.out.println(sum);
				if(count==12)
					{ 				
					System.out.println("table of:" +(i+1));

					sum=0;
				count=0;
						i++;
				}
				
			}
		}

	


}
