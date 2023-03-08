package Apna_package;
//Q1 find array is sorted or not
//Q2 linear search
//Q3 multiple element index 
//index of element if present in array
public class Recursion_Arrays {
 //solution 1
	public static Boolean Sorted_Arrays(int []arr,int i)
     {
    	 if(i==arr.length-1)
    	 {
    		 return true;
    	 }
    	 if(arr[i]<arr[i+1])
    	 {
    		 return Sorted_Arrays(arr, i+1);
    	 }
    	 else {
    		 return false;
    	 }
     }
	//solution2
	public static Boolean Linear_search(int []arr,int key,int i)
	{   
		if(i==arr.length)
		{
			return false;
		}
		if(arr[i]==key)
		{
			return true;
		}
		else {
			return Linear_search(arr, key, ++i);
		}
	}
	//solution3
//	public static ArrayList<Integers> Multiple_element(int []arr,int i)
//	{
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,4,5,4};
//     Boolean k=   Sorted_Arrays(arr, 0);
//     System.out.println(k);
        Boolean l=Linear_search(arr, 1, 0);
        System.out.println(l);
	}

}
