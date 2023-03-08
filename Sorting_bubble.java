package Apna_package;

public class Sorting_bubble {
public static int[] Bubble_sort(int arr[])
{ 
	for(int turn=0; turn<arr.length-1;turn++)
	{
		for(int j=0;j<arr.length-1-turn;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp= arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	return arr;
	}
//public static int[] Selection_Sort(int arr[])
//{
//	int smallest=Integer.MAX_VALUE;
//	for(int i=0;i<arr.length-1;i++)
//	{for(int p=i+1;p<arr.length;p++)
//		if(smallest>arr[p])
//		{
//			smallest=arr[i];
//		}
//	}
//	
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,4,3,5,8,6};
Bubble_sort(arr);
for(int k=0;k<6;k++)
{
	System.out.println(arr[k]);}
	}

}
