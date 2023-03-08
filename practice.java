package Apna_package;

public class practice {
	public static int find(int []arr,int target,int count,int i) {
//		if(i==arr.length) {
//		if(target==0) {
//			count++;
//		}
//		return count;
//		}
//		count=find(arr, target, count, i+1);
//		
//		count= find(arr, target-arr[i], count, i+1);
		
		if(i==arr.length) {
			if(target==0) {
				return 1;
			}
			return 0;
		}
		
		int count1=find(arr,target,count,i+1)+find(arr,target-arr[i],count,i+1);
		return count1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,11,10};
		System.out.println(find(arr, 15, 0, 0));

	}

}
