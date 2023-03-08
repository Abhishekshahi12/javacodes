package Apna_package;

public class MergeSort {

	public static void mergeSort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int mid = si + (ei - si) / 2;
		mergeSort(arr, si, mid);// sorting left side
		mergeSort(arr, mid + 1, ei);// sorting
		merge(arr, si, ei, mid);

	}

	public static void merge(int[] arr, int si, int ei, int mid) {
		int[] temp = new int[ei - si + 1];
		int i = si;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= ei) {
			if (arr[i] < arr[j]) {
				temp[k] = arr[i];

				i++;
			} else {
				temp[k] = arr[j];

				j++;
			}
			k++;
		}
		while (i <= mid) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		while (j <= ei) {
			temp[k++] = arr[j++];

		}
		for (int m = 0, z = si; m < temp.length; m++, z++) {
			arr[z] = temp[m];

		}
	}
	public static void merge_sort_prac(int si,int ei,int []arr) {
	
		if(si>=ei) {
			return;
		}
		int mid=si+(ei-si)/2;
		//left sort
		merge_sort_prac(si,mid, arr);
		//rightsort
		merge_sort_prac(mid+1, ei, arr);
		//merge
		merge_new(arr,si, ei, mid);
	}

	public static void merge_new(int[] arr, int si, int ei, int mid) {
		// TODO Auto-generated method stub
		
		int p1=si;
		int p2=mid+1;
		int k=0;
		int []temp=new int[ei-si+1];
		while(p1<=mid&&p2<=ei) {
			if(arr[p1]<arr[p2]) {
				temp[k]=arr[p1];
				p1++;
			}else {
				temp[k]=arr[p2];
				p2++;
			}
			k++;
		}
		while(p1<=mid) {
			temp[k]=arr[p1];
			k++;
			p1++;
		}
		while(p2<=ei) {
			temp[k]=arr[p2];
			k++;
			p2++;
		}
		for(int i=0,z=si;i<temp.length;i++,z++) {
			arr[z]=temp[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		int[] arr = { 6, 3, 9, 5, 3, 8 };
		int si = 0;
		int ei = arr.length - 1;
		merge_sort_prac(si, ei, arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
