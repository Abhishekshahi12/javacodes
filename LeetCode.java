package Apna_package;

public class LeetCode {
	public static Boolean Parenthesis(String s)
	{
		for(int i=s.length()-1;i>0;i--)
		{
			if(s.charAt(i)=='}')
			{
				if(s.charAt(i-1)!='{')
				{
					return false;
				}
				else {
					continue;
				}
			}
			else if(s.charAt(i)==')')
			{
				if(s.charAt(i-1)!='(')
				{
					return false;
				}
			}
			else if(s.charAt(i)==']')
			{
				if(s.charAt(i-1)!='[')
				{
					return false;
				}
			}
			else {
				return true;
			}
		}
		return null;
		
	}

	public static void main(String[] args) {
	  String s = "(]";
	  System.out.println(Parenthesis(s));

	}

}
