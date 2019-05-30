public class Find_Digits {
    static int findDigits(int n) {

        int val = n;
        int count =0;
        while(val>0)
        {
           int digit = val%10;
           val/=10;

           if(digit!=0 && n%digit==0)
               count++;
        }
        return count;

    }
}
