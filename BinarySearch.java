package Apna_package;

public class BinarySearch {
	public static int search(int arr[],int key)
	{
		int start =0,end=arr.length-1;
		while (start<=end)
		{
			int mid=start +(end-start)/2;
			if(arr[mid]==key)
			{
				return(mid);
			}
			else if(arr[mid]>key)
			{
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
	int arr[]= {4,5,6,7,8,12};
     int key=12;
     int m=search(arr,key);
     System.out.println(m);
 
	

	}

}
