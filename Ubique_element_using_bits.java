package Apna_package;

public class Ubique_element_using_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 5, 3, 10, 18, 18, 5, 3, 5,18 };
           int ans=0;
		for (int i = 0; i <=30; i++) {
			int count0=0,count1=0;
			for(int j=0;j<arr.length;j++)
			{
				if((arr[j]&(1<<i))==0) {
					count0++;
				}
				else {
					count1++;
				}
				
				
			}
//			System.out.println(count0+" "+count1);
			if((count1%3)!=0)
			{
				ans+=1<<i;;
		}
}
		System.out.println(ans);	
	}
	}
