package Apna_package;

public class String_is_pallidrome {
public static Boolean isPallindrome(String str)
{
	for(int i=0;i<str.length()/2;i++)
	{
		if(str.charAt(i)!=str.charAt(str.length()-1-i))
		{
			return false;
		}
		
	}
	return true;
	}
	public static void main(String[] args) {
		String str= "racecar";
		boolean b=isPallindrome(str);
System.out.println(b);
	}

}
