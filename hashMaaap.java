package Apna_package;
import java.util.HashMap;
import java.util.Map;

public class hashMaaap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer>map=new HashMap<>();
		int arr[]= {2,2,4,5,4,10};
		 
			for(int i=0;i<arr.length;i++) {
				if(map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i])+1);
				}else {
					map.put(arr[i], 1);
				}
			}
			for(Map.Entry<Integer,Integer> e: map.entrySet()) {
				System.out.println(e.getKey()+" "+e.getValue());
			}
		

	}

}
