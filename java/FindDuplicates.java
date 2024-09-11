import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {

	public static List<Integer> findModeNestedLoops(List<Integer> test) {
		List<Integer> comparison = new ArrayList<Integer>();
		for (int i = 0; i < test.size(); i++) {
			for (int j = i + 1; j < test.size(); j++) {
				if (test.get(i).equals(test.get(j)) && !comparison.contains(test.get(i)))
				{
					comparison.add(test.get(i));
					
				}
			}

		}

		return comparison;
	}

	public static void main(String[] args) {
		// some test strings:
		List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
		List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
		List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
		List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
		System.out.println("Sample 1: " + findModeNestedLoops(sample1));
		System.out.println("Sample 2: " + findModeNestedLoops(sample2));
		System.out.println("Sample 3: " + findModeNestedLoops(sample3));
		System.out.println("Sample 4: " + findModeNestedLoops(sample4));
	}

}