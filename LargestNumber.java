package Apna_package;

import java.util.Scanner;

public class LargestNumber {
	public static int Largest(int arr[])
	{ int largest=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>largest)
		{
			largest=arr[i];
		}
	}
		return largest;
		
	}
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=Sc.nextInt();
			}
		int k= Largest( arr);
		System.out.println(k);
		
	}
}
