
//note it is not necessary that the size of lists inside the list is always 
//same.

package Apna_package;

import java.util.ArrayList;

public class Multidimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> MainList=new ArrayList<>();//Syntax
		ArrayList<Integer> List1=new ArrayList<>();
		List1.add(2);
		List1.add(3);
		List1.add(4);
		ArrayList<Integer> List2=new ArrayList<>();
		List2.add(2);
		List2.add(3);
		List2.add(4);
		ArrayList<Integer> List3=new ArrayList<>();
		List3.add(2);
		List3.add(3);
		List3.add(4);
		List3.add(2);
		List3.add(3);
		List3.add(4);
		MainList.add(List1);
		MainList.add(List2);
		MainList.add(List3);
		for(int i=0;i<MainList.size();i++)
		{
			System.out.print(MainList.get(i)+" ");
		}
		System.out.println();
		for(int i=0;i<MainList.size();i++)
		{   ArrayList<Integer>current=MainList.get(i);
		for(int k=0;k<current.size();k++)
		{
			System.out.print(current.get(k)+" ");
		}
		System.out.println();	
		}
		
		

	}

}
