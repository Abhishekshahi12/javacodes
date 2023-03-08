package Apna_package;

public class Sub {
	public static void sub(int arr[])
	{
	int max=0;
		for(int i=0;i<arr.length;i++)
		{ 
			int start= i;
			{
				for(int j=0;j<arr.length;j++)
				{int sum=0;
					int end=j;
					{
						for(int k=start;k<=end;k++) 
						{
							//System.out.print(arr[k]);
							sum=sum+arr[k];
							if(sum>max)
							{
								max=sum;
							}
							
						}
					
					}
					
				}
					
			}
		}
		System.out.println(max);
		
	}

	public static void main(String[] args) {
        int arr[]= {6,7,8,9,0};
		sub(arr);			
}
}
