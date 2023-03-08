package Apna_package;
import java.util.*;
public class array2 {
	public static int count_sset_bit(int n)
	{
		int count =0;
		while(n>0)
		{
         if((n&1)==0)
         {
        	 count++;
         }
         n=n>>1;
		}
		return count;
	}
    public static void main(String[] args){
    	int k=count_sset_bit(64);
    	System.out.println(k);
       
    }
}
