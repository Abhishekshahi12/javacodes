package Apna_package;

public class Count_sort {
	public static void Sorting(int []arr)
	{
		//define correct
		int i=0;
		while(i<arr.length)
		{int correct_index=arr[i]-1;
		if(arr[correct_index]==arr[i])
		{
			i++;
		}
		else {
			swap(i, correct_index, arr);
		}
	}
	}
	public static void swap(int i,int correct_index,int arr[])
	{
		int temp=arr[i];
		arr[i]=arr[correct_index];
		arr[correct_index]=temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {3,5,2,1,4};
		Sorting(arr);
          for(int j=0;j<arr.length;j++)
          {
        	  System.out.print(arr[j]+" ");
          }
          
	}

}
