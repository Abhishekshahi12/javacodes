package Apna_package;

import java.lang.Math;

public class Shortest_Path {
public static void sp(String Sam)
{ int x=0, y=0;

	Sam=Sam.toUpperCase();
	for(int i=0;i<Sam.length();i++)
	{
	char dir=Sam.charAt(i);
	if(dir=='N')
	{
		y+=1;
	}
	else if(dir=='S')
	{
		y-=1;
		
	}
	else if (dir=='E')
	{
		x+=1;
	}
	else if(dir=='W'){
		x-=1;
		
	}

		
	}
	int n=x*x;
	int l=y*y;
	float k=(float)Math.sqrt(n+l);
	
	System.out.println(k);
}
	public static void main(String[] args) {
		String Sam= "nssws";
				
	sp(Sam);
	

	}

}
