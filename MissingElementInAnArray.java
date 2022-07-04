package w3.Day2.assignmts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3,4,7,6,8};
		int sum=0,sum1=0; //initialize the variables
		Arrays.sort(arr); //sort the array {1,2,3,4,6,7,8} 
		List<Integer> lst= new ArrayList<Integer>(Arrays.asList(arr)); //store array values in list
		for (int i=0;i<lst.size();i++) {	//iterate using for loop
			sum =sum+lst.get(i);  			//add all the array values from starting to end of array	
		}
		for(int i=1;i<=8;i++) {				//iterate using for loop
			sum1=sum1+i;					//add all the values from 1 to 8 
		}
		System.out.println("missingElement in an array is " +(sum1-sum));	//print the missing element by performing substraction
		}
}



