package Apna_package;

public class Function2 {
	public static void bintodec(int binum)
	{ int mynum=binum;
		int power=0;
		int dec=0;
		while(binum!=0) {
		int ld=binum%10;
		dec=dec+ld*(int)Math.pow(2,power);
		binum=binum/10;
		power++;
	}
		
		System.out.println("binary number is " + mynum + " its decimal form is " + dec);
	
	}
	public static void dectobin(int k)
	{int bin=0;
	int power=0;
		while(k>0)
		{
			int rem=k%2;
			 bin=bin+rem*(int)Math.pow(10, power);
			
			power++;
			k=k/2;
			
			
		}
		System.out.println(bin);
	}
	public static void main(String[] args) {
		
  dectobin(4);
	}

}
