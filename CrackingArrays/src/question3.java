import java.util.HashMap;
import java.util.Scanner;


public class question3 {
	//given two strings ,determine whether one is a permutation of the other
	//time complexity is O(N)
	public static void main(String[] args)
	{
	Scanner n=new Scanner(System.in);
	String s1=n.nextLine();
	String s2=n.nextLine();
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	char[] s1char=s1.toCharArray();
	char[] s2char=s2.toCharArray();
	question3 a= new question3();
	//boolean r=a.permutation(s1, s2);
	//System.out.println(r);
	if(s1.length()!=s2.length())
		System.out.println("They are not permutations");
	else
	{
	for(char s:s1char)
	{
		if(map.containsKey(s))
		   map.put(s,(map.get(s)+1));
		else
			map.put(s, 1);
	}
	
	for(char s:s2char)
	{   
		if(map.containsKey(s))
		{
		map.put(s, (map.get(s)-1));
		if(map.get(s)<0)
			{ 
			System.out.println("not anagrams more characters");
		      break;
			}
		}
		else
			{System.out.println("not anagrams as does not contain same character");
			break;
			}
		    
	}
	
	}
	
	}
	public boolean permutation(String s, String t)
	{
		if(s.length()!=t.length())
			return false;
		int[] letters=new int[256];
		char[] arr=s.toCharArray();
		for(char c:arr)
			letters[c]++;
		for(int i=0;i<t.length();i++)
		{
			int c=(int)t.charAt(i);
			if(--letters[c]<0)
				return false;
		}
		return true;
		}
	}

