package Apna_package;
import java.util.*;
public class Sum_of_Natural_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=1;
		int i=0;
		
		while(k<=n)
		{ i=i+k;
			
			k++;
		}
		
		System.out.println(i);

	}

}
