package Apna_package;

import java.util.Scanner;

public class stringgg {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int t=Sc.nextInt();
		for(int j=0;j<t;j++)
		{
		    int n=Sc.nextInt();
		    int []arr=new int[n];
		    int count=0;
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=Sc.nextInt();
		    }
		    for(int k=0;k<(n-1);k++)
		    {
		       if( arr[k]==arr[k+1])
		       {
		           count++;
		       }
		    }
		    System.out.println(count);
		}
	}

}
