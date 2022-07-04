package w3.Day2.assignmts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		Integer[] data = {3,2,11,4,6,7}; //input data
		Arrays.sort(data); 	// sort the array
		List<Integer> seclar =new ArrayList<Integer>(Arrays.asList(data)); //store values in list
		System.out.println(seclar.get(seclar.size()-2)); //pick the second element from last and print
	}
}
