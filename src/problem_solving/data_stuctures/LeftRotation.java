package problem_solving.data_stuctures;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {

    static int[] leftRotaion(int[] arr, int rotation) {
        rotation = Math.abs(rotation - arr.length);
        int res[] = new int[arr.length];
        for (int i=0; i < arr.length; i++) {
            int position = (i + rotation) % arr.length;
            res[position] = arr[i];
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];
        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        int[] res = leftRotaion(a, d);
        System.out.println(Arrays.toString(res));
    }
}
