package Pruebas;
//First I import ArrayList and Collections packages
import java.util.ArrayList;
import java.util.Collections;

public class SortTheOdd {
	public static int[] sortArray(int[] array) {
		//I create an ArrayList to store each odd at every step of the loop ahead.
		ArrayList <Integer> oddArrayList = new ArrayList<Integer>();
		//I loop the array passed as a parameter, if its value in the x position is odd, is added to oddArrayList.
		for(int x = 0; x<array.length; x++) {
			if(array[x]%2 != 0) {
				oddArrayList.add(array[x]);
			}
		}
		//Then I sort the new ArrayList (ascending order by default).
		Collections.sort(oddArrayList);
		//Now I define a counter to get the position to this ArrayList in the loop ahead.
		int counter = 0;
		
		//Again, a loop to the original array will detect the odd numbers
		for(int x = 0; x< array.length; x++) {
			//when detecting an odd, the number in the x position will be replaced by the one sorted in the Arraylist
			if(array[x]%2 != 0) {
				array[x] = oddArrayList.get(counter);
				//and adds one to the counter to loop the ArrayList.
				counter++;
			}
		}
		//Finally, the method returns the array;
		return array;
	}
	

}
