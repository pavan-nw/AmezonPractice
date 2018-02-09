package coding.puzzles;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: pwadawadagi
 * Date: 4/8/17
 * Time: 9:43 PM
 */
public class PermutationOfString
{
    public static Set<String> permutationFinder(String str)
    {
        Set<String> perm = new LinkedHashSet<>();
        //Handling error scenarios
        if (str == null)
        {
            return null;
        }
        else if (str.length() == 0)
        {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0); // first character
        String rem = str.substring(1); // Full string without first character
        Set<String> words = permutationFinder(rem);
        for (String strNew : words)
        {
            for (int i = 0; i <= strNew.length(); i++)
            {
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String charInsert(String str, char c, int j)
    {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

    public static void main(String[] args)
    {
//            String s = "AB";
//            String s1 = "ABC";
        String s = "ABCD";
        System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
//            System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
//            System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s2));
    }

}

