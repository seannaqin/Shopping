
import java.util.*;

public class SelfChecks {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("It");
		list.add("was");
		list.add("a");
		list.add("stormy");
		list.add("night");
		list.add(3, "dark");
		list.add(4, "and");
		list.set(1, "IS");
		
		
		
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).contains("a")) {
				list.remove(i);
			}
		}
		
		System.out.println(list);
		
		ArrayList<Integer> multiple = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			multiple.add(i,  2*i);
		}
		
		System.out.println(multiple);
		
		if (list.contains("IS")) {
			System.out.println("The array contains the word \"IS\"");
		}
		else {
			System.out.println("There is no is");
		}
	}
	

}

/*
 * 1. An ArrayList is an array that is more flexible. We would want to use an ArrayList
 * when we want to add or remove elements, thus changing the length of the array.
 * 
 * 2. e. ArrayList<Integer> list = new ArrayList<Integer>();
 * 
 * 3. The size of the list is 5, and the type is a String
 *		ArrayList<String> list = new ArrayList<String>();
 *		list.add("It");
 *		list.add("was");
 *		list.add("a");
 *		list.add("stormy");
 *		list.add("night");
 * 
 * 4. list.add(3, "dark");
 *    list.add(4, "and");
 * 
 * 5. list.set(1, "IS");
 *    
 * 6. for (int i = list.size() - 1; i >= 0; i--) {
 *		  if (list.get(i).contains("a")) {
 *			  list.remove(i);
 *		  }
 *	  }
 *
 * 7. ArrayList<Integer> multiple = new ArrayList<Integer>();
 *	  for (int i = 0; i < 10; i++) {
 *		  multiple.add(i,  2*i);
 *	  }
 *
 * 9. if (list.contains("IS")) {
 *		  System.out.println("The array contains the word \"IS\"");
 *	  }
 *	  else {
 *		  System.out.println("There is no is");
 *	  }
 */