package problem_solving;

import java.util.List;

public class Bon_Appetit {

    static void bonAppetit(List<Integer> bill, int k, int b) {
            int sum=0;
            for(int i=0;i<bill.size();i++)
            {
                if(i==k)
                    continue;
                else
                    sum+=bill.get(i);
            }

            int actual=sum/2;
            if(actual==b)
            {
                System.out.println("Bon Appetit");
            }
            else
                System.out.println(b-actual);

    }
    
}
