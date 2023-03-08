package Apna_package;

public class Swapping_without_using_3rd_var {
	public static void  Swap_without_using_third_var(int a,int b)
	{    a=a+b;
	     b=a-b;
	     a=a-b;
	     System.out.println("a=" + a + " b=" + b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap_without_using_third_var(5, 4);

	}

}
