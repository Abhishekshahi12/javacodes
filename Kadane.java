package Apna_package;

public class Kadane {
public static void sum(int arr[])
{int current_sum=0;
 int max_sum=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++) 
 {
	 current_sum= current_sum+arr[i];
	 if(current_sum<0)
	 {
		 current_sum=0;
		 
	 }
	 max_sum=Math.max(max_sum,current_sum);
 }
 System.out.println(max_sum);
 
 
	}
	public static void main(String[] args) {
		int arr[]= {1,3,5};
		sum(arr);


	}

}
