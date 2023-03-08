package Apna_package;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList1 {
   public static void RevOfArrayList(ArrayList<Integer> List )
   {
	   for(int i=List.size()-1;i>=0;i--)
	   {
		  System.out.println(List.get(i)); 
	   }
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<Integer>List=new ArrayList<>();
   Scanner Sc=new Scanner(System.in);
   List.add(1);
   List.add(4);
   List.add(34);
   List.add(9000);
   List.add(900000000);
   int k=List.get(0);
//   for(int i=0;i<List.size();i++)
//   {
//	   System.out.println(List.get(i));
//   }
//   List.add(1,1);
//   for(int i=0;i<List.size();i++)
//   {
//	   System.out.println(List.get(i));
//   }
//   List.set(5, 0);
//   List.remove(2);
//   for(int i=0;i<List.size();i++)
//   {
//   System.out.println(List.get(i));
//	}
//   RevOfArrayList(List);
	}
}
