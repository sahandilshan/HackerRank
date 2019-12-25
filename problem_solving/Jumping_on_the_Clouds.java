package problem_solving;

public class Jumping_on_the_Clouds {
    static int jumpingOnClouds(int[] c, int k) {

        int jumps = c.length/k;
        if(c.length%k!=0)
            jumps++;
        int i = 0;
        int cCloudCount = 0;
        while(i<c.length)
        {
            if(c[i]==1)
                cCloudCount++;
            i+=k;
        }

        return 100-jumps-cCloudCount*2;

    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0 ,0 ,1 ,0 ,0 ,1 ,1 ,0},2));
    }
}
