package Apna_package;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int count=0;
		int [] arr=new int[6];
		for(int i=0;i<6;i++)
		{
			arr[i]=Sc.nextInt();
		}
		System.out.println("Enter key");
		int key=Sc.nextInt();
		for(int j=0;j<5;j++)
		{
			if(arr[j]==key)
			{
				System.out.println("Ky found at index " +j);
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("element not found");
		}

	}

}
