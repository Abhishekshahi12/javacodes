package Apna_package;

import java.util.Arrays;

public class Secondlargest {
	public static void sl(int arr[])
	{ Arrays.sort(arr);
	int k=arr[arr.length-1];
	int i=arr.length-1;
	while(arr[i]==k)
	{
		i--;
	}
	System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,2,3,6,6,6,4,4,5,5};
		sl(arr);
		

	}

}
