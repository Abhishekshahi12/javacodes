package Apna_package;

public class tiling_Problem {
	public static int no_of_ways(int n)
	{
		if(n==0 ||n==1)
		{
			return 1;
		}
//		 no_of_ways(n-1) is vertical choice and no_of_ways(n-2) is horizontal choice.
		int k=no_of_ways(n-1)+no_of_ways(n-2);
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(no_of_ways(5));
	}

}
