package w3.Day2.assignmts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		Integer arr1 [] = {3,2,11,4,6,7}; 				//Define the array1 
		Integer arr2 [] = {1,2,8,4,9,7}; 				// Define the array 2
		List<Integer> lst1 = new ArrayList<Integer>(Arrays.asList(arr1)); // storing the array1 values in list
		List<Integer> lst2 = new ArrayList<Integer>(Arrays.asList(arr2)); // storing the array1 values in list
		List<Integer> lstIntersect = new ArrayList<Integer>(); //declare the list to add the duplicates into list
					
		for (int i=0;i<lst1.size();i++) { 			//iterate using for loop for array1
				for (int j=0;j<lst2.size();j++) { 	//iterate using for loop for array2
					 	if(lst1.get(i)==lst2.get(j)) {	//compare two lists using condition
						lstIntersect.add(lst1.get(i));  // if values are equal add to list
					}
				}	
			}
			System.out.println(lstIntersect); //print the intersection values
	}
}
