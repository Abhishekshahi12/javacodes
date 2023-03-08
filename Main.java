package Apna_package;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
		Scanner Sc=new Scanner(System.in);
		String S=Sc.next();
	    char []ch=new char[26];
	    for(int i=0;i<S.length();i++)
	    {
	    	ch[i]=S.charAt(i);
	    }
//		 int  []arr=new int[26];
//			for(int i=0;i<26;i++)
//			{
//				arr[i]=0;
//			}
//		for(int i=0;i<26;i++)
//		{
//            if(arr[ch[i]-'a']==0)
//            {
//            	arr[ch[i]-'a']=1;
//            }
//            else {
//            	arr[ch[i]-'a']+=1;
//            }
//		}
		for(int i=0;i<26;i++)
		{
			System.out.print(ch[i]+" ");
		}

	}

}
