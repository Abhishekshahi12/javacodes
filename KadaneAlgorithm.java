package Apna_package;

public class KadaneAlgorithm {
	public static void Kadane(int arr[])
	{ int current_sum=0;
	int ms=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			current_sum=current_sum+arr[i];
			if(current_sum<0)
			{current_sum=0;}
			ms=Math.max(ms,current_sum);
		}
		System.out.println(ms);
	}

	public static void main(String[] args) {
		int arr[]= {-2,-3,4,-1,-2,1,5,-3};
		Kadane(arr);
	}

}
