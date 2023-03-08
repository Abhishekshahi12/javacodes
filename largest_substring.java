package Apna_package;

public class largest_substring {
	public static void main(String[] args) 
	{
		String []arr=new String[] {"Tony","Army","Honey"};
		String Largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].compareTo(Largest)>0)
			{
				Largest=arr[i];
			}
		}
		System.out.println(Largest);
	}
	
}
