package problem_solving;

public class Divisible_Sum_Pairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count=0;
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                int x=ar[i]+ar[j];
                if(x%k==0)
                    count++;
            }
        }
        return count;
    }

}
