package com.hackerrank.ipk;

import java.io.*;
import java.util.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        /*StringUtils.countMatches(s, "a") * n/s.length()
                + StringUtils.countMatches(StringUtils.substring(s,0,(int)(n%s.length())), "a");
*/

        int countPerString = 0;
        int countInSubString = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((n % s.length()) > 0 && i == (int) (n % s.length())){
                countInSubString = countPerString;
            }
            if (s.charAt(i) == 'a') {
                countPerString++;
            }
        }

        System.out.println("countPerString:"+countPerString);
        System.out.println("countInSubString:"+countInSubString);

        return (countPerString * (n / s.length())) + countInSubString;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
