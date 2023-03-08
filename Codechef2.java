package Apna_package;

import java.util.Scanner;

public class Codechef2 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int t=Sc.nextInt();
		for (int i=0;i<t ;i++ ) 
		{
		    int n=Sc.nextInt();
		    String s=Sc.next();
		    String Str="";
		    String Str2="";
		   for(int j=0;j<n/2;j++)
		   {
		       Str= Str+s.charAt(j);
		   }
		    for(int j=n/2 +1;j<s.length();j++)
		   {
		       Str2= Str2+s.charAt(j);
		   }
		   if(Str.compareTo(Str2)==0)
		   {
		       System.out.println("Yes");
		   }
		   else{
		       System.out.println(Str2);
		   }
		    
		}

	}

}
