package manman.ohmyjava.leetcode;

 
public class Permudation_1920 
{
    public static void main( String[] args )
    {
       
    	 int[] nums = {0,2,1,5,3,4};
    	 
    	 int len = nums.length;    	
    	 int[] rest = new int[len];
    	 
    	 for(int i=0; i < len ; i++) {
    		 rest[i] = nums[nums[i]];    		    		 
    	 }
    	 
    	 for(int i = 0 ; i < rest.length ; i++) {
    		 System.out.println(rest[i]);
    	 }
    }    
    
}
