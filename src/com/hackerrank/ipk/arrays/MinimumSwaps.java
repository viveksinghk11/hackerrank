package com.hackerrank.ipk.arrays;

import java.io.*;
import java.util.*;

public class MinimumSwaps {

    static int minimumSwaps(int[] arr) {

        List list = Arrays.asList(arr);
        int swap=0;
        for(int i=0; i<arr.length; i++) {

            int index = list.indexOf(i+1);
            if(index != i) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                swap++;
            }

               /* int swap=0;
            for(int i=0; i<arr.length; i++) {
                int smallest = arr[i];
                int swapIndex = -1;
                for(int j=i+1; j<arr.length; j++) {
                    if(smallest > arr[j]) {
                        swapIndex = j;
                        smallest = arr[j];
                    }
                }
                if(swapIndex > 0) {
                    int temp = arr[i];
                    arr[i] = arr[swapIndex];
                    arr[swapIndex] = temp;
                    swap++;
                }
            }
            return swap;*/
        }
        return swap;
    }

    public static void main(String[] args) {

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("C:\\DEV\\LAB\\hackerrank\\src\\com\\hackerrank\\ipk\\arrays\\test1.txt"));
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        if(null == scanner) {
            return;
        }

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        long startTime = new Date().getTime();
        int res = minimumSwaps(arr);

        System.out.println("Total time taken:" + (new Date().getTime() - startTime) + " miliseconds");
        System.out.println(String.valueOf(res));

        scanner.close();
    }
}
