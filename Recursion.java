package Apna_package;
//recursion subsequence problem is in recursion3
public class Recursion {
	public static void decreasing(int n) {
		if (n == 0) {
			return;
		}
		System.out.print(n + " ");
		decreasing(n - 1);
	}

	public static void increasing(int n, int i) {
		if (i == n) {
			return;
		}
		System.out.println(i);

		increasing(n - 1, i + 1);

	}

	public static int factorial(int n) {
		if (n == 0) {
			return -1;
		}
		if (n == 1) {
			return n;
		}
		n = n * factorial(n - 1);
		return n;
	}

	public static int N_natural(int n) {
		if (n == 0) {
			return n;
		}
		n = n + N_natural(n - 1);
		return n;

	}

	public static Boolean check_sorted(int[] arr, int i) {
		if (i == arr.length - 1) {
			return true;
		}
		if (arr[i] < arr[i + 1]) {
			return check_sorted(arr, ++i);
		} else {
			return false;
		}

	}

	public static int first_occurence(int arr[], int target, int i) {
		if (i == arr.length) {
			return -1;
		}
		if (arr[i] == target) {
			return i;
		} else {
			return first_occurence(arr, target, ++i);
		}

	}

	public static int last_occurence(int arr[], int target, int i) {
		if (i == -1) {
			return -1;
		}
		if (arr[i] == target) {
			return i;
		} else {
			return first_occurence(arr, target, --i);
		}

	}

	public static int xtothepown(int x, int n) {
		if (n == 0) {
     return 1;
		}
		
		x = x * xtothepown(x, n - 1);
		return x;
	}
	public static long  optimised_powered(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		long half_power=optimised_powered(x, n/2);
		long ans=half_power*half_power;
		if(n%2==1)
		{
			ans=x*ans;
		}
			
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		decreasing(10);
//		increasing(10,0);
//	int l=	factorial(5);
//		System.out.println(l);
//		int sum_of_natural_numbers=N_natural(10);
//		System.out.println(sum_of_natural_numbers);
//		int arr[]= {2,3,5,4,5,1};
//		System.out.println(last_occurence(arr,5 , arr.length-1));
//		System.out.println(xtothepown(5, 2));
		System.out.println(optimised_powered(5, 10));

	}

}
