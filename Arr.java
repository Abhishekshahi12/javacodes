package Apna_package;

public class Arr {
	public static void num(char MyChar[])
	{int count=0;
	int left=0;
	int right=0;
		for(int i=0;i<MyChar.length;i++)
		{
		if(MyChar[i]!='a'|| MyChar[i]!='e'||MyChar[i]!='i'||MyChar[i]!='o'||MyChar[i]!='u')
		{
			
			
			left++;
			
		}}
		for(int i=0;i<MyChar.length;i++) {
		if(MyChar[i]=='a'|| MyChar[i]=='e'||MyChar[i]=='i'||MyChar[i]=='o'||MyChar[i]=='u')

		{
			right++;
		}
		if(left==right)
		{count++;}
		
			
		}
		System.out.println(count);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char MyChar[]= {'b','a','c','f','e','g','s','k','e','u'};
       num(MyChar);
	}

}
