package Apna_package;
//given arr have elements 1,2,3,4,3,3,4,5
//we have to find the number of sumbarrays having sum 10 using window sliding
//here k is 3
//so loop will be till n-k+1 as we have to count
public class window_sliding_problem {
	public static int window(int []arr,int count,int k)
	{   
		for(int i=0;i<=arr.length-k;i++)//n=arr.length
		{   int sum=0;
			for(int j=i;j<i+k;j++)
			{
				sum=sum+arr[j];
			}
			if(sum==10)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,3,3,4,5};
		System.out.println(window(arr,0,3));
		}

}
