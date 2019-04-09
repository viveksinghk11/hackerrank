import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'romanizer' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static List<String> romanizer(List<Integer> numbers) {

        List<String> result = new ArrayList<>();
        Map<Integer, String> romanDictionary = new HashMap<>();
        romanDictionary.put(1,"I");
        romanDictionary.put(2,"II");
        romanDictionary.put(3,"III");
        romanDictionary.put(4,"IV");
        romanDictionary.put(5,"V");
        romanDictionary.put(6,"VI");
        romanDictionary.put(7,"VII");
        romanDictionary.put(8,"VIII");
        romanDictionary.put(9,"IX");
        romanDictionary.put(10,"X");
        romanDictionary.put(40,"XL");
        romanDictionary.put(50,"L");
        romanDictionary.put(90,"XC");
        romanDictionary.put(100,"C");
        romanDictionary.put(400,"CD");
        romanDictionary.put(500,"D");
        romanDictionary.put(900,"CM");
        romanDictionary.put(1000,"M");

        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()){

            Integer number = iterator.next();
            String roman = "";

            for(int temp=number, i=0;temp>0;number=number-number%(10*i)) {
                roman = roman + romanDictionary.get(number);
                temp=temp/10;
            }
            result.add(roman);
        }
        return result;
    }

    private static String getRomanDictionary(Integer number) {
        Map<Integer, String> romanDictionary = new HashMap<>();
        romanDictionary.put(1,"I");
        romanDictionary.put(2,"II");
        romanDictionary.put(3,"III");
        romanDictionary.put(4,"IV");
        romanDictionary.put(5,"V");
        romanDictionary.put(6,"VI");
        romanDictionary.put(7,"VII");
        romanDictionary.put(8,"VIII");
        romanDictionary.put(9,"IX");
        romanDictionary.put(10,"X");
        romanDictionary.put(40,"XL");
        romanDictionary.put(50,"L");
        romanDictionary.put(90,"XC");
        romanDictionary.put(100,"C");
        romanDictionary.put(400,"CD");
        romanDictionary.put(500,"D");
        romanDictionary.put(900,"CM");
        romanDictionary.put(1000,"M");
        return romanDictionary.get(number);
    }

}

public class Romanizer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<String> result = Result.romanizer(numbers);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
