package problem_solving.data_stuctures;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SparseArrays {
    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            int count = 0;
            for (String string : strings) {
                if (query.equals(string)) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] strings = new String[stringsCount];
        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }
        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] queries = new String[queriesCount];
        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }
        int[] res = matchingStrings(strings, queries);
        System.out.println(Arrays.toString(res));
        scanner.close();
    }
}
