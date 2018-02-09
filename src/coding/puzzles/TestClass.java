package coding.puzzles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: pwadawadagi
 * Date: 23/5/17
 * Time: 9:10 PM
 */
public class TestClass
{

    public static void main(String args[]) throws Exception
    {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
//        line.
        int N = Integer.parseInt(line);

        //Scanner
        Scanner s = new Scanner(System.in);
//        int N = s.nextInt();

        for (int i = 0; i < N; i++)
        {
            System.out.println("hello world");
        }


        System.out.println("Hello World!");
    }
}
