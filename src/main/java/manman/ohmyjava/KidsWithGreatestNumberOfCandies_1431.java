package manman.ohmyjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.xml.transform.stream.StreamSource;

public class KidsWithGreatestNumberOfCandies_1431 {
	public static void main(String [] args) {
		
		for(int i =0 ; i<getVal().length ; i++) {
			System.out.println(getVal()[i]);
		}		 
	}
	
	
	public static boolean[] getVal() {
		int[] candies = { 2,3,5,1,3 };
		int extraCandies = 3;
		
		
		int maxInArray = Arrays.stream(candies).max();
		boolean[] rest = new boolean[candies.length];
		for(int i=0;i<candies.length;i++) {
			if(candies[i]+extraCandies >=maxInArray) {
				rest[i]=true;
			}
			
			
		Arrays.stream(candies).forEach(num -> System.out.println(num););
		}
		
		return rest;
	
	}

}



// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/