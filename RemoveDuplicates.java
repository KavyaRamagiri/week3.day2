package w3.Day2.assignmts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
			
		String text = "We learn java basics as part of java sessions in java week1"; 
		String [] split =text.split(" ");				//split the text wherever space is present and store it in string array  
		Set <String> set = new LinkedHashSet<String>(); //create a LinkedHashSet
		List<String> lst= new ArrayList<String>(Arrays.asList(split));	//create a list to store all the words 
		for(int i=0;i<lst.size();i++) {					//iterate using for loop
				set.add(lst.get(i));					//add values to set
		}
		System.out.println(set); 						//print the set
	}
}



	
	
	


	


