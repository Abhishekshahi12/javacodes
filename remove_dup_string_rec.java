package Apna_package;

public class remove_dup_string_rec {
	public static StringBuilder remove_dup(int index,String str,StringBuilder sb,boolean []index_arr)
	{
		if(index==str.length())
		{
			return sb;
		}
		int current_index= str.charAt(index) - 'a';
		if(index_arr[current_index]==true)
		{
			return remove_dup(index+1, str, sb, index_arr);
		}
		else {
			index_arr[current_index]=true;
			sb.append(str.charAt(index));
			return remove_dup(index+1, str, sb, index_arr);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuilder sb=new StringBuilder();
     boolean []index_arr=new boolean[26];
     String str="appnnacollege";
     System.out.println(remove_dup(0, str, sb, index_arr));
	}

}
