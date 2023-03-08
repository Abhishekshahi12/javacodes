package Apna_package;

import java.util.ArrayList;

public class Subseq {
	public static void subsequence(int []arr,int i,int j,ArrayList<Integer> ar) {
		if(i==arr.length) {
			System.out.println(arr[i]);
			return;
		}
		
//		subsequence(arr, i+1);

	}
	public static Boolean prime(int n,int i) {
		if(n<3) {
			return true;
		}
		
		if(n%i==0) {
			return false;
		}
		if(i*i>=n) {
			return true;
		}
		return prime(n, i+1);
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr= {1,2,3,4};
        System.out.println(prime(2, 2));
      
        
	}

}
