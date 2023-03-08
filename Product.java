package Apna_package;

public class Product {
public static int product(int a,int b)
{int c=a*b;
	return c;
	}
public static int factorial(int a)
{
	int f=1;
	for(int i=1;i<=a;i++) 
	{
		f=f*i;
		
	}
	
	return f;
	
	}
public static int coefficient(int n,int r) {
	int b=factorial(n);
	int c=factorial(r);
	int d=factorial(n-r);
	int coe=b/(c*d);
	return coe;
}

	public static void main(String[] args) {
		//int c=product(4,5);
		//System.out.println(c);
		//int fac=factorial(6);
		int binomial_coefficient=coefficient(7,4);
		System.out.println("Binomial coefficeient of the given number is " +binomial_coefficient );

	}

}
