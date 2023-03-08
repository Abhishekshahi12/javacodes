package Apna_package;

import java.util.ArrayList;

public class ArrayList2 {
	public static int Largest_element(ArrayList<Integer> List) {
		int largest = List.get(0);
		for (int i = 1; i < List.size(); i++) {
			int m = List.get(i);
			if (largest < m) {
				largest = m;
			}
		}
		return largest;

	}

	public static void swap(ArrayList<Integer> list) {
       int a=list.get(2);
       int b=list.get(3);
       int c=a;
       list.set(2, b);
       list.set(3, c);
       for(int i=0;i<list.size();i++)
       {
    	   System.out.println(list.get(i));
       }
	}

	public static void main(String[] args) {
		ArrayList<Integer> List = new ArrayList<>();
		List.add(2);
		List.add(5);
		List.add(3);
		List.add(9);
		List.add(6);
		//int k = Largest_element(List);
		//System.out.println(k);
		//swap(List);

	}

}
