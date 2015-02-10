import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class bracketcheck {
	public static void main(String[] args)
	{
		String input;
		while(true)
		{
			System.out.println("enter string");
			System.out.flush();
			input=getString();
			if(input.equals(""))
				break;
			bracketchecker sr= new bracketchecker(input);
			sr.check();
			
		}
	}

	public static String getString()
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = null;
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
}



class bracketchecker{
	String input;
	public bracketchecker(String in)
	{
		input=in;
	}
	
	public void check(){
		int size=input.length();
		stackx s=new stackx(size);
		for(int j=0;j<size;j++)
		{
		char ch=input.charAt(j);
		switch(ch)
		{
		case '{':
		case '[':
		case '(': s.push(ch);
		break;
		case '}':
		case ']':
		case ')':
			if(!s.isempty())
			{
				char chx=s.pop();
				if((ch=='}'&&chx!='{')||
				   (ch==']'&&chx!='[')||
				   (ch==')'&&chx!='('))
					System.out.println("error"+ ch +"at"+j);
			}
			else 
				System.out.println("error"+ ch +"at"+j);
			break;
		default: break;
		}
		
		if(!s.isempty())
			System.out.println("Error:no right delimiter");
		}
	}
}