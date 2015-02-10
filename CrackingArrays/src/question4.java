import java.util.Scanner;


public class question4 {
	public static void main(String[] args)
	{
		Scanner n=new Scanner(System.in);
		String input = n.nextLine();
		char[] a=input.toCharArray();
		int spacecount=0, len=a.length,i=0,newlength=0;
		int j=0;
		
		String result="";
		for(;i<len;i++)
		{
			if(a[i]==' ')
				spacecount++;
		}
		newlength=len+spacecount*2;
	  
	   /* char b[]= new char[newlength];
		for(i=0;i<len&&j<newlength;i++)
		{
			if(a[i]==' ')
			{
				b[j++]='%';
				b[j++]='2';
				b[j++]='0';
				
				
			}
			else{
				b[j++]=a[i];
				
			
				
			}
		}
		for(j=0;j<newlength;j++)
		{
			result=result+b[j];
		}
		System.out.println(result);*/
		
		for(int k=len-1;k>=0;k--)
		{
			if(a[k]==' ')
			{
				a[newlength-1]='0';
				a[newlength-2]='2';
				a[newlength-3]='%';
				newlength=newlength-3;
			}
			else
			{
				a[newlength-1]=a[k];
				newlength=newlength-1;
			}
		}


				
		for(j=0;j<newlength;j++)
		{
			result=result+a[j];
		}
		System.out.println(a.toString());		
		
	}

}
