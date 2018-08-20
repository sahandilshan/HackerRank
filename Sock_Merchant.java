import java.util.Arrays;

public class Sock_Merchant {
    static int sockMerchant(int n, int[] ar) {
        int count=0;
        Arrays.sort(ar);
        for(int i=0;i<ar.length;i++) {
            if (i != ar.length - 1) {
                if (ar[i] == ar[i + 1]) {
                    i++;
                    count++;
                }
            }
        }
        return count;
    }
}
