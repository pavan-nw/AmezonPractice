package amazon.pratice;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: pwadawadagi
 * Date: 10/5/17
 * Time: 9:07 PM
 */
public class CartisianMap
{
    static int[][] tanks = {{0, 0}, {1, 1}};
    static int[][] obcts = {{0, 2}, {0, -2}, {-2, 0}, {3, 1}};

    static int N = 2, M = 4;
    static String[] dirctions = new String[N];

    public static void main(String[] args)
    {
        for (int i = 0; i < N; i++)
        {
            dirctions[i] = "ENSW";
            for (int j = 0; j < N; j++)
            {
                if (i != j)
                {
                    isHit(tanks[i], tanks[j], i);
                }

            }

            for (int k = 0; k < M; k++)
            {
                isHit(tanks[i], obcts[k], i);
            }
            if (!dirctions[i].isEmpty())
            {
                System.out.println("Direction for " + tanks[i][0] + "," + tanks[i][1] + "-->" + dirctions[i].charAt(0));
            }
        }

    }

    private static void isHit(int[] tank, int[] obct, int tankIndex)
    {
        if (tank[0] == obct[0] || tank[1] == obct[1])
        {
            if (tank[0] < obct[0])
            {
                dirctions[tankIndex] = dirctions[tankIndex].replace("E", "");
            }
            if (tank[0] > obct[0])
            {
                dirctions[tankIndex] = dirctions[tankIndex].replace("W", "");
            }

            if (tank[1] < obct[1])
            {
                dirctions[tankIndex] = dirctions[tankIndex].replace("N", "");
            }
            if (tank[1] > obct[1])
            {
                dirctions[tankIndex] = dirctions[tankIndex].replace("S", "");
            }

        }
    }

}
