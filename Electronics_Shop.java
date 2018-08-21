public class Electronics_Shop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int max=-1,n=keyboards.length,m=drives.length;

        for(int i=0;i<n;i++)
        {
            int kb=keyboards[i];
            for(int j=0;j<m;j++)
            {
                int usb=drives[j];
                int sum=usb+kb;
                if(sum<=b && sum>=max)
                {
                    max=sum;
                }
            }
        }
            return max;
    }
}
