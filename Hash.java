package Apna_package;

import java.util.HashMap;

public class Hash {
public static int[] Remove_duplicate(int num[])
{
	HashMap<Integer, Integer > map=new HashMap<>();
	for(int i=0;i<num.length;i++)
	{
		map.put(num[i],i);
	}
	for(int k=0;k<map.size();k++)
	{
		num[k]=map.get("key");
	}
	
	return num;
	}
	public static void main(String[] args) {
	
		int num[]= {1,1,1,3,3,3,4,5,2};
		Remove_duplicate(num);
		for(int x: num)
		{
			System.out.println(x);
		}

	}

}
