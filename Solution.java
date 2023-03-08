package Apna_package;



	class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        int count=0;
	        int [] arr=new int[nums.length];
	        int [] ans=new int[nums.length];
	         int [] ret=new int[2];
	        for(int i=0;i<=nums.length;i++)
	        {
	            arr[i]=Math.abs(target-nums[i]);
	        }
	        for(int j=0;j<nums.length;j++)
	        {
	            ans[j]=nums[j]+arr[j];
	        }
	        for(int k=0;k<nums.length;k++)  
	        {
	            if(ans[k]==target)
	            {
	              count++;  
	            }
	            if(count==1)
	            {ret[0]=k;}
	            if(count==2)
	            {
	                ret[1]=k;
	            }
	        
	          
	            
	            
	            
	      
	        
	    }
	        return ret;
	}

}
