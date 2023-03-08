package Apna_package;

import java.util.Arrays;

//find ceiling of array -smallest grater element than tartget or equal to  target
//find floor of an array- largerst smallest number than target
//find first and last occurence facebook question
//find out the number by which array is rotated
public class BinarySearchwithKunal {
	public static int find_ceiling_of_arr(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		if (start == arr.length) {
			return Integer.MAX_VALUE;
		}
		return arr[start];
	}

	public static int find_floor(int arr[], int target) {
		int ans = Integer.MAX_VALUE;
		int start = 0;
		int end = arr.length;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return target;
			} else if (arr[mid] > target) {
				end = mid - 1;

			} else {

				ans = arr[mid];
				start = mid + 1;
			}

		}
		return ans;

	}

	public static int[] find_firstandLastindex(int[] arr, int target) {
		int[] ans = { -1, -1 };

		int start = binary_search(arr, 7, true);
		int end = binary_search(arr, target, false);
		ans[0] = start;
		ans[1] = end;

		return ans;

	}

	public static int binary_search(int[] arr, int target, Boolean start) {
		int sta = 0;
		int ans = -1;
		int end = arr.length - 1;
		while (sta <= end) {
			int mid = sta + (end - sta) / 2;
			if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] < target) {
				sta = mid + 1;
			} else {
				ans = mid;
				if (start) {
					end = mid - 1;
				} else {
					sta = mid + 1;
				}
			}

		}
		return ans;

	}
    public static void rev_arr(int start,int end,int[]arr) {
    	while(start<end) {
    		int temp=arr[start];
    	    arr[start]=arr[end];
    	    arr[end]=temp;
    	    start++;
    	    end--;
    		
    	}
    }
	public static void rotated_k_times(int []arr,int k) {
	  rev_arr(0, arr.length-1, arr);
	  rev_arr(0, k-1, arr);
	  rev_arr(k, arr.length-1, arr);
//	  for(int i=0;i<arr.length;i++) {
//		  System.out.print(arr[i]+" ");
//	  }
	  int start=0;
	  int end=arr.length;
	  int ans=0;
	  
	  while(start<=end) {
		  int mid=start+(end-start)/2;
//		  if(arr[mid])
	  }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 5, 7, 7, 7, 7, 8, 8, 9 };
		Arrays.sort(arr);
//		System.out.println(find_ceiling_of_arr(arr, 25));
//		System.out.println(find_floor(arr,-7 ));
//		System.out.println(find_firstandLastindex(arr, 7));
//		rev_arr(0, arr.length-1, arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		rotated_k_times(arr, 3);
        
	}

}
