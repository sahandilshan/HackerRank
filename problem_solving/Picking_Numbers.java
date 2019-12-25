package problem_solving;

import java.util.Arrays;

public class Picking_Numbers {

    static int pickingNumbers(int[] a) {
        int max=0,count=0,n=a.length;
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            int val=a[i];
            for (int j=0;j<n;j++)
            {
                if(a[j]==(val+1) || a[j]==val)
                    count++;
            }
            max=(count>max) ?count:max;
            count=0;
         }
        return max;
    }


}
