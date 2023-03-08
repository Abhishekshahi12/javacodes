package Apna_package;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("It is not prime");
				break;
			}
			else {
			count++;}
		}
		if(count==n-2)
		{
			System.out.println("It is prime");//hint for more optimization loop sqrt root n tk chalega
			
		}

	}

}
