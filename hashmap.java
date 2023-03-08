package Apna_package;
import java.util.HashMap;
import java.util.Map;  
//public class HashMapExample2{  
// public static void main(String args[]){  
//   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
//   map.put(1,"Mango");  //Put elements in Map  
//   map.put(2,"Apple");    
//   map.put(3,"Banana");   
//   map.put(1,"Grapes"); //trying duplicate key  
//       
//   System.out.println("Iterating Hashmap...");  
//   for(Map.Entry m : map.entrySet()){    
//    System.out.println(m.getKey()+" "+m.getValue());    
//   }  Map.Entry m :map.entrySet()
//}  
//}  
public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap <Integer,Integer> map=new HashMap<>();
      map.put(1, 1);
      map.put(2,2 );
      map.put(5,5);
      for(Map.Entry m:map.entrySet())
      {
    	  System.out.println(m.getKey()+" "+m.getValue());
      }
	}

	
}
