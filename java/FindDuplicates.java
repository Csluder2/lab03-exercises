import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
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

    public static List<Integer> findDuplicatesWithHashMap(List<Integer> test) {
        Map<Integer, Integer> comparisonMap = new HashMap<>();
    List<Integer> comparison = new ArrayList<>();

    
    for (int i = 0; i < test.size(); i++) {
        Integer num = test.get(i); 
        if (comparisonMap.containsKey(num)) {
            comparisonMap.put(num, comparisonMap.get(num) + 1);
        } else {
            comparisonMap.put(num, 1);
        }
    }

    
    for (int i = 0; i < test.size(); i++) {
        Integer num = test.get(i); 
        if (comparisonMap.get(num) > 1 && !comparison.contains(num)) {
            comparison.add(num);
        }
    }

    return comparison;
}

    public static void main(String[] args) {

        List<Integer> sample1 = new ArrayList<>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<>(Arrays.asList(3));

        System.out.println("Sample 1: " + findModeNestedLoops(sample1));
        System.out.println("Sample 2: " + findModeNestedLoops(sample2));
        System.out.println("Sample 3: " + findModeNestedLoops(sample3));
        System.out.println("Sample 4: " + findModeNestedLoops(sample4));

        System.out.println("Sample 1 Hashmap: " + findDuplicatesWithHashMap(sample1));
        System.out.println("Sample 2 Hashmap: " + findDuplicatesWithHashMap(sample2));
        System.out.println("Sample 3 Hashmap: " + findDuplicatesWithHashMap(sample3));
        System.out.println("Sample 4 Hashmap: " + findDuplicatesWithHashMap(sample4));
    }
}
