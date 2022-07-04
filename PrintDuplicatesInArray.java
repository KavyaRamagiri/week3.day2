package w3.Day2.assignmts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> lst= new ArrayList<Integer>(Arrays.asList(arr)); //convert to set
		Set <Integer> set = new LinkedHashSet<Integer>();			   //create a hashset
		Set<Integer> duplicate =new LinkedHashSet<Integer>();		   //create a hashset for output	
		for(int i=0;i<lst.size();i++) {
			if(!set.add(lst.get(i))){									//each value of list send to set (without having duplicates)	
				duplicate.add(lst.get(i));								//remaining duplicates add to set
			}		
		}
		System.out.println(duplicate);									//print set of duplicates
	}
}
	
 