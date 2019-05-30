public class Beautiful_Days_at_the_Movies {

    static int beautifulDays(int i, int j, int k) {

        int count=0;
        for(;i<=j;i++)
        {
            int reverse=0;
            int val = i;
            while(val>0)
            {
                int digit = val%10;
                reverse = reverse*10+digit;
                val=val/10;
            }

            System.out.println("i :"+i+" Reverse :"+reverse);
            if((i-reverse)%k==0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        beautifulDays(1000,2000,5);
    }
}
