import java.util.ArrayList;


public class permutations {
//program to find permutation of a string
	public static void main(String[] args)
	{
		 String str= "God";
		 ArrayList<String> r=permute(str);
		 for(String g: r)
			 System.out.println(g);
	}
	
	public static ArrayList<String> permute(String str)
	{
		if(str==null)
			return null;
		ArrayList<String> permutations=new ArrayList<String>();
		if(str.length()==0)
		{
			permutations.add("");
			return permutations;
			
		}
		
		char first=str.charAt(0);
		String word=str.substring(1);
		ArrayList<String> words=permute(word);
		int j=0;
		for(String s: words)
		{
			for(j=0;j<=s.length();j++)
			 {String result = replace(s,first,j);
			  permutations.add(result);
			 }
		}
		 return permutations;
	}
	
	public static String replace(String s, char c, int j)
	{
		String start=s.substring(0,j);
		String end=s.substring(j);
		return start+c+end;
	}
}
