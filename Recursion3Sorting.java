package Apna_package;

import java.util.ArrayList;
import java.util.Iterator;

public class Recursion3Sorting {
	public static void pattern(int row, int column) {
		if (row == 4) {
			return;
		}
		if (column < row) {
			System.out.println();
			pattern(++row, 3);
		}
		System.out.print("*");
		pattern(row, --column);

	}

	public static void print_no_of_subseq_of_val_k(int[] arr, int k, int i, ArrayList<Integer> ds, int sum) {
		if (i == arr.length) {
			if (sum == k) {
				System.out.println(ds);

			}
//			System.out.println(sum);
			return;
		}
		// pick
		ds.add(arr[i]);
		print_no_of_subseq_of_val_k(arr, k, i + 1, ds, sum + arr[i]);
		// not pick
		ds.remove(ds.size() - 1);
		print_no_of_subseq_of_val_k(arr, k, i + 1, ds, sum);
	}

	public static void print_subseq(int[] arr, int i, ArrayList<Integer> ds) {
		if (i == arr.length) {
			System.out.println(ds);
			return;
		}
		;
		// pick
		ds.add(arr[i]);
		print_subseq(arr, i + 1, ds);
		// not pick
		ds.remove(ds.size() - 1);
		print_subseq(arr, i + 1, ds);

	}

	// mergesort
	public static void merge_sort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int mid = si + (ei - si) / 2;
		// for left
		merge_sort(arr, si, mid);
		// for right
		merge_sort(arr, mid + 1, ei);
		merge(arr, si, ei, mid);
		

	}

	// merge function
	public static void merge(int[] arr, int si, int ei, int mid) {
		int i = si; // pointer for left
		int j = mid + 1; //pointer for right
		int k=0;//pointer for temp
		int []tempArr=new int [ei-si+1];
		while(i<=mid && j<=ei) {
			  if(arr[i]>arr[j]) {
				  tempArr[k]=arr[j];
				  j++;
			  }else {
				  tempArr[k]=arr[i];
				  i++;
			  }
			  k++;
		}
		while(i<=mid) {
			tempArr[k]=arr[i];
			i++;
			k++;
		}
		while(j<=ei) {
			tempArr[k]=arr[j];
			j++;
			k++;
		}
		for(int l=si,m=0;l<tempArr.length;l++,m++) {
			arr[l]=tempArr[m];
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2,1,5,7,10 };
//		ArrayList<Integer> ds = new ArrayList<>();
////		print_subseq(arr, 0,  ds);
//		print_no_of_subseq_of_val_k(arr, 3, 0, ds, 0);

//		pattern(0,3);
		merge_sort(arr, 0, arr.length-1);
		   for(int i=0;i<arr.length;i++) {
			   System.out.println(arr[i]);
		   }

	}

}
