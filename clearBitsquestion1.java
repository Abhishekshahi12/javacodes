package Apna_package;
//clear last 2 ith bits
public class clearBitsquestion1 {
	public static int clear_last_2_ith_bits(int n)
	{for(int i=0;i<2;i++)
		{int bitMask= ~(1<<i);
		n=(n&bitMask);
		
		}
		return n;
	}
	public static void count_set_bits(int num)
	{ int count=0;
		while(num>0)
		{
			if((num&1)!=0)
			{count++;}
			num=num>>1;
			
		}
		System.out.println(count);
	}
	public static void power_of_2_or_not(int n)
	{
		if((n &(n-1))==0)
		{
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

	public static void main(String[] args) {
//		System.out.println(clear_last_2_ith_bits(15));
		count_set_bits(0);
//             power_of_2_or_not(8);
	}

}
