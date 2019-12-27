package problem_solving;

import java.util.Collections;
import java.util.List;

public class MigratoryBirds {
    static int migratoryBirds(List<Integer> arr) {

        int max=arr.get(0),maxCount=0;;
        int n=arr.size();
        Collections.sort(arr);
        for(int i=0;i<n;i++)
        {
            int temp=arr.get(i);
            int count=0;

            for (int j=i;j<n;j++)
            {
                if (temp==arr.get(j))
                {
                    count++;
                }

                if(count>maxCount)
                {
                    maxCount=count;
                    max=temp;

                }



                if (temp!=arr.get(j))
                {

                    i=j-1;
                    break;
                }

            }
        }

        return max;
    }


}
