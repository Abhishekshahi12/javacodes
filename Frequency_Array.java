package Apna_package;

import java.util.HashMap;
import java.util.Map;

public class Frequency_Array {
	public static void freq(int arr[],int n)
	{
		HashMap<Integer,Integer> result=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(result.containsKey(arr[i]))
			{
				result.put(arr[i],arr[i]+1);
			}
			else {
				result.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer,Integer> i: result.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,4,5,6,7,7,5,9};
		int n=arr.length;
		freq(arr, n);
		
			
				
			

	}

}
