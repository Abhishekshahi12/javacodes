package Apna_package;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner Sc=new Scanner(System.in);
	   
	    
		
		
		   int or=0;
		    int n=Sc.nextInt();
		    int y=Sc.nextInt();
		    int []arr=new int[n];
		    for(int m=0;m<n;m++)
		    {
		        arr[m]=Sc.nextInt();
		    }
		    for(int m=0;m<n-1;m++ )
		    {
		        or=(or|(arr[m]|arr[m+1]));
		    }
		    System.out.println(or);
		    
		}
		
	}

