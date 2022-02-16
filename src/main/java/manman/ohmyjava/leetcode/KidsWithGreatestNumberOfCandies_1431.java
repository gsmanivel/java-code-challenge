package manman.ohmyjava.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.xml.transform.stream.StreamSource;

public class KidsWithGreatestNumberOfCandies_1431 {
	public static void main(String [] args) {
		getVal().stream().forEach(val -> System.out.println(val));
	}
	
	
	public static List<Boolean> getVal() {
		int[] candies = { 2,3,5,1,3 };
		int extraCandies = 3;

		int maxInArray = Arrays.stream(candies).max().getAsInt();
		List<Boolean> rest = new ArrayList<>();
		Arrays.stream(candies).forEach( candy -> {
			boolean b = (candy + extraCandies) >= maxInArray ? rest.add(true) : rest.add(false);
		});
		return rest;
	
	}

}



// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/