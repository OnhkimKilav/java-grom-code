package lesson32.hometask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Valik on 19.10.2018.
 */
public class Solution {
    private static int countWrong = 3;

    public static void readNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (sum == 0 && countWrong > 0) {
            String str = reader.readLine();
            String[] strings = str.split(" ");

            for (String string : strings) {
                int number = validate(string, strings.length);
                if(number == -1) {
                    sum = 0;
                    break;
                }
                sum += number;
            }
        }
        if (countWrong == 0) {
            System.out.println("Your numbers are wrong. Number of attempts exceeded");
            return;
        }

        System.out.println(sum);
    }

    private static int validate(String str, int strLength) {
        if (!str.matches("[\\d]+") || !(strLength == 10)) {
            if (countWrong == 1) {
                countWrong--;
                return -1;
            }
            countWrong--;
            System.out.println("You numbers are wrong. You have " + countWrong + " attempts to try again");
            return -1;
        }
        int iStr = Integer.parseInt(str);
        if (iStr > 100) {
            if (countWrong == 1) {
                countWrong--;
                return -1;
            }
            countWrong--;
            System.out.println("You numbers are wrong. You have " + countWrong + " attempts to try again");
            return -1;
        }

        return iStr;
    }
}
