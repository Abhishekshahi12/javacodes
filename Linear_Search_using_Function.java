package Apna_package;

public class Linear_Search_using_Function {
	public static int Linear_Search(int numbers[],int key) {
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==key)
			{
			return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {1,2,6,4,7,3};
		int key=4;
 int j= Linear_Search(numbers,key);
 if(j==-1)
 {
	 System.out.println("not found");
 }
 else {
	 System.out.println(" found "+j);
	 
 }

	}

}
