package Apna_package;

import java.util.Arrays;
import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner Sc=new Scanner (System.in);
		int t=Sc.nextInt();
		for(int i=0;i<t;i++)
		{//System.out.println("enter length of string");
			//int s=Sc.nextInt();
			System.out.println("enter string");
			String Str=Sc.nextLine();
			int s=Str.length();
			if(s<=2)
			{
				System.out.println(Str);
			}
			else {
				char [] arr=new char[s];
				for(int j=0;j<s;j++)
				{
					arr[j]=Str.charAt(j);
				}
				Arrays.sort(arr);
				for(int k=0;k<s;k++)
				{
					System.out.print
					(arr[k]);
				}
			}
		}
		

	}

}
