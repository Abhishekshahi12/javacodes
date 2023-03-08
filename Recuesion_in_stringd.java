package Apna_package;

public class Recuesion_in_stringd {
    public static void remove_a(String str,int index,StringBuilder Sb)
    {
    	if(index==str.length())
    	{   System.out.println(Sb);
    		return ;
    	}
    	if(str.charAt(index)!='a')
    	{
    		Sb.append(str.charAt(index));
    	}
    	remove_a(str, index+1, Sb);
    	
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuilder Sb=new StringBuilder();
     String str="aaaadssfdsr";
     remove_a(str, 0, Sb);
     
	}

}
