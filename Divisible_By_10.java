package Apna_package;

import java.util.Scanner;

public class Divisible_By_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		while(true)
		{
			int n=sc.nextInt();
			
			if(n%10==0)
			{ System.out.println("divisible by 10 so cant be printed.");
				break;
			}
			System.out.println(n);
		}
	}

}
