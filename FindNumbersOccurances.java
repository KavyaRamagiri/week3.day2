package w3.Day2.assignmts;
import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		
		Integer[] arr= {2,3,5,6,3,2,1,4,2,1,6,-1}; //initialize the variables 
		Map<Integer,Integer> occur=new TreeMap<Integer,Integer>(); //create the Treemap
		for (int i = 0; i < arr.length; i++)	//iterate using for loop
        {	
			int key = arr[i];					//assign to key 
            if (occur.containsKey(key))			//check if the index element is present in the map
            {
                int count = occur.get(key);		//assign to count variable
                count++;						//increment the count
                occur.put(key, count);			//add the value and count to map
            } else
            {
            	occur.put(key, 1);				// if false add value and default count as 1
            }
        }
		
		System.out.println("Number of Occurance of each integer is " +occur); //print the occurances
        	
				
	}
}
		
		
