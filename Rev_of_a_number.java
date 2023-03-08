package Apna_package;

public class Rev_of_a_number {

	public static void main(String[] args) {
		int n=123;
		int rev=0;
		while(n>0)
		{
		int	rem=n%10;
			rev=rev*10+rem;
			n/=10;
			
		}
		System.out.println();

	}

}
