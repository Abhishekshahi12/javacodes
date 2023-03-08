package Apna_package;

public class Two_D_Arrays {
	public static void printSpiral(int[][] spiral) {

		int Start_row = 0;
		int Start_column = 0;
		int end_row = spiral.length - 1;

		int end_column = spiral[0].length - 1;
		while (Start_row <= end_row && Start_column <= end_column) { // top
			for (int j = Start_column; j <= end_column; j++) {
				System.out.print(spiral[Start_row][j] + " ");
			}
			// rightboundary
			for (int i = Start_row + 1; i <= end_row; i++) {
				System.out.print(spiral[i][end_column] + " ");
			}
			// bottomboundary
			{
				for (int j = end_column - 1; j >= Start_column; j--) {
					System.out.print(spiral[end_row][j] + " ");
				}
				// leftmostboundary
				for (int i = end_row - 1; i > Start_row; i--) {
					System.out.print(spiral[i][Start_column] + " ");
				}
				Start_column++;
				Start_row++;
				end_column--;
				end_row--;
			}
		}
	}

	public static void diagonal_sum(int [][]matrix)
    {
    	
    	  int d1=0;
    	int d2=0;
    		for(int i=0;i<matrix.length;i++ )
    		{
    			for(int j=0;j<matrix[0].length;j++)
    			{
    				if(i==j)
    				{
    					d1=d1+matrix[i][j];
    				}
    			}
    		}
    		for(int i=0;i<matrix[0].length;i++)
    		{
    			for(int j=matrix[0].length-1;j>=0;j--)
    			{  if(i==j)
    			{
    				continue;
    			}
    			else	if(i+j==matrix.length-1)
    			{
    				d2=d2+matrix[i][j];
    			}
    				
    			}
    			
    		}
    		System.out.println(d1+d2);
    	}
    
	public static void Diagonal_sum(int [][]matrix)
	{    int sum=0;
	     int sum2=0;
		for(int i=0;i<matrix.length;i++)
		{
			sum+=matrix[i][i];//for primary diagonal
			//if(i+j=n-1) then j=n-1-i ,so to find secondary diagonal we logic is i+j=n-1
			if(i!=matrix.length-i-1)
			{
				sum2+=matrix[i][matrix.length-i-1];
				
			}
		}
		System.out.print(sum+sum2);
	}

	public static int Staircase_Search(int [][]matrix,int key) //when row and column both are sorted
	{  int m=matrix.length-1;
	  int n=matrix[0].length-1;
		int row=0,column=n;
		while(column!=0&&row!=m)
		{ if(key==matrix[row][column])
		{
			System.out.print(row+" "+column);
			return key;
		}
		else if(key>matrix[row][column])
			{
				row++;
			}
		else {
			column--;
		}
		
		
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] spiral = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		printSpiral(spiral);
//        int [][]matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        diagonal_sum(matrix);
//        Diagonal_sum(matrix);
//        
//        
//        System.out.println();
//        Staircase_Search(matrix, 11);
	}

}
