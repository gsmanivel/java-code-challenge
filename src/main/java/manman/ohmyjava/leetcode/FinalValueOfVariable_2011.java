package manman.ohmyjava.leetcode;

public class FinalValueOfVariable_2011 {
	public static void main(String [] args) {
		System.out.println(getVal());
		 
	}

	public static int getVal() {
		// input
		String[] operations = { "--X", "X++", "X++" };

		int val = 0; // default value for the variable as per the problem statement
		for (String op : operations) {
			if (op.equals("--X") || op.equals("X--"))
				val = val - 1;

			else if (op.equals("++X") || op.equals("X++"))
				val = val + 1;
		}
		return val;
	}
	
	
	
	
	
	
	
	/*There is a programming language with only four operations and one variable X:

		++X and X++ increments the value of the variable X by 1.
		--X and X-- decrements the value of the variable X by 1.
		Initially, the value of X is 0.

		Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

		 

		Example 1:

		Input: operations = ["--X","X++","X++"]
		Output: 1
		Explanation: The operations are performed as follows:
		Initially, X = 0.
		--X: X is decremented by 1, X =  0 - 1 = -1.
		X++: X is incremented by 1, X = -1 + 1 =  0.
		X++: X is incremented by 1, X =  0 + 1 =  1.
		*/

}
