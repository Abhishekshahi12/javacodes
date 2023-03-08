package Apna_package;

public class sieve_of_erastosthenes {
	public static void sieve(boolean []arr,int num)
	{
	 for(int i=2;i*i<=num;i++)
	 {
		 if(arr[i]==false)
		 {
			 for(int j=2*i;j<=num;j+=i)// j=j+i is liye hai kyuki pehle 2*2 check how phir j 4 ho jayga
			 {
				 arr[j]=true;
			 }
		 }
	 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=40;
      boolean arr[]=new boolean[num+1];
      sieve(arr, num);
      for(int i=2;i<=num;i++)
      {
    	  if(arr[i]==false)
    	  {
    		  System.out.println(i);
    	  }
      }
      
	}

}
