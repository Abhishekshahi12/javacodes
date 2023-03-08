package Apna_package;

public class Prefixarr {
public static void Max_Sum(int arr[]) {
	int prefix_arr[]=new int[arr.length];
	for(int i=1;i<arr.length;i++)
	{ 
		prefix_arr[i]=prefix_arr[i-1]+arr[i];
		
		}
	int max=0;
	
	prefix_arr[0]=arr[0];
	for(int j=0;j<arr.length;j++) {
		int start=j;
		for(int k=0;k<arr.length;k++)
		{int end=k;
		int sum=0;
		
		if(start==0)
		{
			sum=prefix_arr[end];
			
		}else {
		sum=prefix_arr[end]-prefix_arr[start-1];
           }
		if(max<sum)
		{
			max=sum;
		}
		
		}
	}
	System.out.println("Prefixarr.Max_Sum()"+max);
	
}
	public static void main(String[] args) {
     int arr[]= {1,4,6,7};
     Max_Sum(arr);
	}

}
