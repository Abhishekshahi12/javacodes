package Apna_package;
import java.util.ArrayList;
public class stack {
	static ArrayList<Integer>list=new ArrayList<>();
	public Boolean isEmpty() {
		
		if(list.size()==0) {
			return true;
		}else {
			return false;
		}
	}
	public static void push(int data) {
		list.add(data);
	}
	public static int pop() {
		int top=list.get(list.size()-1);
		list.remove(list.size()-1);//to remove last index we get the last index from list.size()-1
		return top;
	}
	public static int peek() {
		int top=list.size()-1;
		return list.get(top);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack stk=new stack();
        stk.push(8);
        stk.push(70);
        stk.push(23);
        stk.push(22);
       while(stk.isEmpty()!=true) {
    	   System.out.println(stk.peek());
    	   stk.pop();
       }
	}

}
