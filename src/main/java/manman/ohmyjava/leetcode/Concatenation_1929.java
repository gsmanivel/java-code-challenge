package manman.ohmyjava.leetcode;

 
public class Concatenation_1929 
{
    public static void main( String[] args )
    {
       
    	 int[] nums = {1,2,3};
    	 
    	 int len = nums.length;    	
    	 int[] rest = new int[len*2];
    	 
    	 for(int i=0; i < len ; i++) {
    		 rest[i] = nums[i];
    		 rest[i+len] = nums[i];    		 
    	 }
    	 
    	 for(int i = 0 ; i < rest.length ; i++) {
    		 System.out.println(rest[i]);
    	 }
    }    
    
}
