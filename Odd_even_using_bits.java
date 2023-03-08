package Apna_package;

import java.util.Scanner;

public class Odd_even_using_bits {

	public static void odd_even(int a) {
		if ((a & 1) == 1) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}

	}

	public static int get_ith_bit(int a, int i) {
		int bitMask = 1 << i;
		if ((a & bitMask) == 0) {
			return 0;
		} else {
			return 1;
		}
	}

	public static int set_ith_bit(int a, int i) {
		int bitMask = 1 << i;
		int k = a | bitMask;
		return k;
	}

	public static int clear_ith_bit(int a,int i)
	{
		int bitMask=~(1<<i);
		int k= a & bitMask;
		return k;
	}
	public static int update_ith_bit(int n,int i,int newbit)
	{
		if(newbit==0)
		{
			int k =set_ith_bit(i, newbit);
			return k;
		}
		else {
			int k=set_ith_bit(i, newbit);
			return k;
		}
	
	}
	
	
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
//		int a=Sc.nextInt();
//		int i=Sc.nextInt();
		// odd_even(a);
//		System.out.println(set_ith_bit(4, 0));
		//System.out.println(clear_ith_bit(5, 0));
		System.out.println(update_ith_bit(5,2, 1));
		
	}

}
