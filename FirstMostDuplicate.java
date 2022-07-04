package w3.Day2.assignmts;

import java.util.HashMap;
import java.util.Map;
public class FirstMostDuplicate {

	public static void main(String[] args) {
		String input = "abbaba" ;										 //initialize the variable
		
		Map<Character,Integer> mostdup= new HashMap<Character,Integer>(); //create a Hashmap
		char[] charArray = input.toCharArray(); 						  // convert to characters and store in character array
		char str = input.charAt(0); 									  //Returns the char value at the specified index
		int count=0;													  //initialize the count
		
		for (int i = 0; i <charArray.length; i++) 						  //iterate using for loop
        {	
			mostdup.put(charArray[i], mostdup.getOrDefault(charArray[i],0)+1); //add values to map
			if(mostdup.get(charArray[i])>count)  							//check the count using condition
			  {
				str= charArray[i]; 											//assign to str
				count=mostdup.get(charArray[i]); 							//get the values from map and assign to count
			  }
		  }
       System.out.println("Number of times" + " " + str + " " +  "occurs in string abbaba is" + " " +count); //print the firstmost duplicate
       
	}
}


		
		
	
	

