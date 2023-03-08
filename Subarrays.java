package Apna_package;

public class Subarrays {
	public static void Sub(int arr[])
	{ for(int i=0;i<arr.length;i++)
	{
	int	start=i;
	for(int j=0;j<arr.length;j++)
	{
	int	end =j;
		for(int k=start;k<=end;k++)
		{
			System.out.print(arr[k]);
		}
		System.out.println();
	}	
	}	
	}
	public static void main(String[] args) {
		int arr[]= {1,3,4,5};
		Sub(arr);
}
}
