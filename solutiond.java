package Apna_package;

import java.util.Arrays;

import java.util.Scanner;

	


public class solutiond {

	public static void Sorting(int []arr)
	{
		//define correct
		int i=0;
		while(i<arr.length)
		{int correct_index=arr[i]-1;
		if(arr[correct_index]==arr[i])
		{
			i++;
		}
		else {
			swap(i, correct_index, arr);
		}
	}
	}
	public static void swap(int i,int correct_index,int arr[])
	{
		int temp=arr[i];
		arr[i]=arr[correct_index];
		arr[correct_index]=temp;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		int count =0;
		int n=Sc.nextInt();
		int []arr=new int[n];
		for(int i=1;i<n-1;i++)
		{
		 arr[i]=Sc.nextInt();
		}
		Sorting(arr);
		
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=i+1)
			{
				count=i+1;
			}
		}
		if(count==0)
		{
			System.out.println("1");
		}
		else {
		System.out.println(count);

	}
	}
}
