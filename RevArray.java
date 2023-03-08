package Apna_package;

public class RevArray {
	public static int[] rev(int arr[])
	{int start=0,end=arr.length-1;
		while(start<end)
		{
			int z=arr[start];
			arr[start]=arr[end];
			arr[end]=z;
			start++;
			end--;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[]= {5,6,7,8};
		rev(arr);
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j
			                       ]);
		}
	}

}
