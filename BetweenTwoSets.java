public class BetweenTwoSets {

    static int getTotalX(int[] a, int[] b) {
        /*
         * Write your code here.
         */
        int count=0;
        for (int i=a[a.length-1];i<=100;i++)
        {
            boolean number=true,cNumber=true;

            for (int x:a)
            {
                if(i%x==0);
                else
                {
                    number=false;
                    break;
                }
            }

            if (number)
            {
                for (int y:b)
                {
                    if(y%i==0);
                    else
                    {
                        cNumber=false;
                        break;
                    }
                }
                if(cNumber)
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
