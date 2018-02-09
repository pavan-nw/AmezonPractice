package coding.puzzles.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: pwadawadagi
 * Date: 29/7/17
 * Time: 2:21 PM
 */
public class RemoveDuplicateNumInList
{
    static Integer[] nums = new Integer[]{1, 2, 3, 2, 1, 2, 4, 4, 4, 4, 4};
    static List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(nums));

    public static void main(String[] args)
    {
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
