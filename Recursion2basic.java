package Apna_package;

public class Recursion2basic {
    public static int fibonaci(int n)
    {
    	if(n==0)
    	{
    		return 0;
    	}
    	if(n==1)
    	{
    		return 1;
    	}
    int count =0;
  
    count=count+fibonaci(n-1)+fibonaci(n-2);
//    System.out.print(count+" ");
    return count;
    }
	
    public static int binary_search(int arr[],int target,int start,int end)
    {
    	if(start>end)
    	{
    		return -1;
    	}
    	int mid =(start+end)/2;
    	if(arr[mid]==target)
    	{
    		return mid;
    	}
    	else if(arr[mid]>target)
    	{
    		return binary_search(arr, target, start, mid-1) ;
    	}
    	else {
    	return binary_search(arr, target,mid+1, end);
    	
    	
    	
    }}
    public static int find(int []arr,int target,int count,int i) {
		if(i==arr.length) {
		if(target==0) {
			count++;
		}
		return count;
		}
		count=find(arr, target, count, i+1);
		
		count= find(arr, target-arr[i], count, i+1);
		return count;
	}
	public static int sum_of_digits(int n)
	{  
		
		if(n==0)
		{
			return 0;
		} 
		
		return  n%10 +sum_of_digits(n/10);
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//  int k=fibonaci(50);
//  System.out.println(k);
//		int []arr= {10,46,55,64,78};
//		int ans=binary_search(arr, 78, 0, arr.length-1);
    	int m=sum_of_digits(1450);
		System.out.println(m);
	}

}
