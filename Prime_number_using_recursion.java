package Apna_package;

public class Prime_number_using_recursion {
	public static boolean isPrime(int n)
	{ int i=2;
	if(n==2)
	{
		return true;
	}
	if(i==n)
	{
		return true;
	}
	if(n%i==0)
	{
		return false;
	}
	i++;
	return isPrime(n-1);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(isPrime(5));
	}

}
