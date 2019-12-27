package problem_solving.data_stuctures;

public class Arrays_DS {

    static int[] reverseArray(int[] a) {
        int[] reverseArr = new int[a.length];
        for (int i=0; i < a.length; i++) {
            reverseArr[i] = a[a.length - i -1];
        }
        return reverseArr;
    }
}
