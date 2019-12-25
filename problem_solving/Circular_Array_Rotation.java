package problem_solving;

import java.util.Scanner;

public class Circular_Array_Rotation {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int [] x= new int[queries.length];

        k = k%a.length; //if k>a.length
        for(int i=0;i<queries.length;i++)
        {
            int index = queries[i]-k;
            if(index<0) {
                index = a.length + index;
            }
            x[i] = a[index];
        }
        return x;
    }

    public static void main(String[] args) {

//        circularArrayRotation(new int[]{1,2,3,4,5,6},3,new int[]{0,1,2,3,4});
        Scanner scanner =new Scanner(System.in);
        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(a, k, queries);
    }
}
