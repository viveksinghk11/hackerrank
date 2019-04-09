import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagram {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        int i=0,j=0,deleteChar=0;

        String sortedA = sortString(a);
        String sortedB = sortString(b);

        for(i=0,j=0; i<sortedA.length() && j<sortedB.length();){
            if(sortedA.charAt(i)<sortedB.charAt(j)){
                i++;
                deleteChar++;
            } else if(sortedA.charAt(i)>sortedB.charAt(j)){
                j++;
                deleteChar++;
            } else {
                i++;
                j++;
            }
        }
        return deleteChar + (sortedA.length() - i) + (sortedB.length() - j);
    }

    static String sortString(String str){
        char tempArr[] = str.toCharArray();
        Arrays.sort(tempArr);
        return new String(tempArr);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
