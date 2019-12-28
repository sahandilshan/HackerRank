package problem_solving.data_stuctures;

import java.util.Scanner;

public class Two_D_Array_DS {
    static int hourglassSum(int[][] arr) {
        int[][] sumOfThree = sumOfThree(arr);
        int max = -63;
        for (int i=0; i < sumOfThree.length - 2; i++) {
            for (int j = 0; j < sumOfThree[0].length; j++) {
                int sum = sumOfThree[i][j] + arr[i + 1][j + 1] + sumOfThree[i + 2][j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    static int[][] sumOfThree(int[][] arr) {
        int[][] sumArr = new int[arr.length][arr[0].length-2];
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            while (j < arr[0].length -2) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                sumArr[i][j] = sum;
                j++;
            }
        }
        return sumArr;
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);
    }
}
