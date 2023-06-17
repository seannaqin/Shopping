
import java.util.*;

public class Exercises {
	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("Hello", "my", "name", "is"));
		System.out.println(averageVowels(test));
		System.out.println();
		
		ArrayList<Integer> test8 = new ArrayList<>(Arrays.asList(0, 7, 2, 0, 0, 4, 0));
		removeZeroes(test8);
		System.out.println(test8);
		System.out.println();
		
		ArrayList<Integer> test9a = new ArrayList<>(Arrays.asList(7, 2, 0, 0, 4, 0, 9, 0, 6, 4, 8));
		ArrayList<Integer> test9b = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(rangeBetweenZeroes(test9a));
		System.out.println(rangeBetweenZeroes(test9b));
		test9b.add(0);
		System.out.println(rangeBetweenZeroes(test9b));
		System.out.println();
		
		ArrayList<Integer> test13 = new ArrayList<>(Arrays.asList(3, 8, 19, 42, 7, 26, 19, -8));
		reverse3(test13);
		System.out.println(test13);
		}
	
	// Exercise 1
	public static double averageVowels(ArrayList<String> list) {
		double average = 0.0;
		for (int i = 0; i < list.size(); i++) {
			int counter = 0; 
			for (int j = 0; j < list.get(i).length(); j++) {
				if (list.get(i).charAt(j) == 'a' || list.get(i).charAt(j) == 'e' || list.get(i).charAt(j) == 'i'
						|| list.get(i).charAt(j) == 'o' || list.get(i).charAt(j) == 'u') {
					counter++;
				}
			}
			average += counter;
		}

		return average / list.size();
	}
	
	// Exercise 8
	public static void removeZeroes(ArrayList<Integer> list) {
		while (list.contains(0)) {
			list.remove(list.indexOf(0));
		}
	}
	
	// Exercise 9
	public static int rangeBetweenZeroes(ArrayList<Integer> list) {
		int firstI = list.size();
		int lastI = -1;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 0) {
				if (i < firstI) {
					firstI = i;
				}
				if (i > lastI) {
					lastI = i;
				}
			}
		}
		
		if (firstI == list.size() ) {
			return 0;
		}
		return lastI - firstI + 1;
	}
	
	// Exercise 13
	public static void reverse3(ArrayList<Integer> list) {
		for (int i = 2; i < list.size(); i += 3) {
			int holder = list.get(i);
			list.set(i, list.get(i-2));
			list.set(i-2, holder);
		}
	}
}
