/*
 * This is just an experiment to see if I can implement something like a Python set
 * in Java. The point is to create a list of duplicates, as well as a set without
 * any duplicates.
 */

import java.util.*;

public class NoDuplicates {
    public static void main(String[] args) {

	int nums[] = { 1, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 9, 9, 10 };
	HashSet<Integer> s = new HashSet<Integer>();
	ArrayList<Integer> duplicates = new ArrayList<>();

	for (int i = 0; i < nums.length; i++) {
	    int a = s.size();
	    s.add(nums[i]);
	    int b = s.size();

	    if (a == b) {
		duplicates.add(nums[i]);
	    }
	}

	System.out.println("There are " + duplicates.size() + " duplicates in nums:");
	System.out.println(duplicates.toString());
    }
}