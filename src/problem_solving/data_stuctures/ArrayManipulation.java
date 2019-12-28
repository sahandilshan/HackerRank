package problem_solving.data_stuctures;

import java.util.Scanner;

public class ArrayManipulation {
    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n];
        long max = Long.MIN_VALUE;
        for (int[] query : queries) {
            arr[query[0] - 1] += query[2]; // set arr[l-1] += k
            if (query[1] < n) {
                arr[query[1]] -= query[2]; // set arr[r] -= k,
            }
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
            if (arr[i] > max) {
                max = arr[i];
                /*
                if query = [2, 10, 100], that's mean indexes upto 1-9 should be increased by 100,
                so we set arr[1] = 100, arr[10] = -100 in above for loop, so after this iterations, arr[] is as follows,
                  arr[1] = 100, arr[2] = arr[1]<100> + 0,.... arr[9] = arr[8]<100> + 0, arr[10] = arr[9]<100> + -100.
                  <x> represent the value of the element.
                  */

            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[][] queries = new int[m][3];
        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);
        System.out.println(result);
        scanner.close();
    }
}
