import java.io.*;
import java.util.*;

public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int minSwaps = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                int swapWithIndex = search(Arrays.copyOfRange(arr,i,arr.length), arr[i]);
                int temp=arr[swapWithIndex];
                arr[swapWithIndex]=arr[i];
                arr[i]=temp;
                minSwaps++;
            }
        }
        return minSwaps;
    }

    static int search(int[] arr, int search){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == search){
                return i;
            }
        }
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
