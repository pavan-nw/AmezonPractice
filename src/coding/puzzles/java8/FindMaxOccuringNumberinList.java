package coding.puzzles.java8;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by IntelliJ IDEA.
 * User: pwadawadagi
 * Date: 29/7/17
 * Time: 2:21 PM
 */
public class FindMaxOccuringNumberinList
{
    static Integer[] nums = new Integer[]{1, 2, 3, 2, 1, 2, 4, 4, 6, 5, 4, 5, 4, 3, 6};
    static List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(nums));
    static int n = 50;

    public static void main(String[] args)
    {
        IntStream.rangeClosed(2, n).filter(a -> isPrime(a)).forEach(a -> System.out.print(a + " "));


        Map<Integer, Integer> occuranceMap = new LinkedHashMap<>();

        numbers.stream()
                .forEach(a -> occuranceMap.put(a, Collections.frequency(numbers, a)));

        Optional<Map.Entry<Integer, Integer>> max = occuranceMap.entrySet().stream()
                .max((o1, o2) -> o1.getValue() - o2.getValue());

        Optional<Map.Entry<Integer, Integer>> min = occuranceMap.entrySet().stream()
                .min((o1, o2) -> o1.getValue() - o2.getValue());

        Optional<Map.Entry<Integer, Integer>> firstNonRepeated = occuranceMap.entrySet().stream()
                .filter(e -> e.getValue() == 1).findFirst();


        System.out.println("Max: " + max.get());
        System.out.println("Min: " + min.get());
        System.out.println("firstNonRepeated: " + firstNonRepeated);
    }

    private static boolean isPrime(int a)
    {
        return IntStream.rangeClosed(2, a / 2).noneMatch(b -> a % b == 0);
    }
}
