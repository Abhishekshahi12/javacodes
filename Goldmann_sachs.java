package Apna_package;

import java.util.Scanner;

public class Goldmann_sachs {
//	public static int pair(int n)
//	{}
    public static void Printwithoutconsecutiveone(String S,int n)
    {   
    	if(S.charAt(n)=='1'&& S.charAt(n+1)=='1')
    	{   System.out.println("False String");
    		
    	}
    	if(n==S.length()-2)
    	{
    	   System.out.println(S);
    	}
       Printwithoutconsecutiveone(S, n+1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		String S=Sc.next();
		Printwithoutconsecutiveone(S, 0);
	}

}
