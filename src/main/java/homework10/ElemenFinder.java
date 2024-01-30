package homework10;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ElemenFinder {
    public static <T> T findElement( Collection<T> collection, T targetElement) {
        return collection.stream()
         .filter(element -> element.equals(targetElement))
         .findFirst()
         .orElse(null);
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer targetElement = 5;

        Integer result = findElement(numbers, targetElement);

        // Print the result
        if (result != null) {
            System.out.println("Element found: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
