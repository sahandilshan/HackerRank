import java.util.Arrays;

public class Sequence_Equation {
    static int[] permutationEquation(int[] p) {
        int [] ppy = new int[p.length];
        for(int i=1;i<=p.length;i++)
        {
            int x = 0;
            for(int j=0;j<p.length;j++)
            {

                if(i==p[j])
                {
                    x=j+1;
                    break;
                }
            }
            for(int k=0;k<p.length;k++)
            {
                if(p[k]==x)
                {
                    ppy[i-1] = k+1;
                    break;
                }
            }
        }
        return ppy;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(permutationEquation(new int[]{4 ,3 ,5 ,1 ,2})));
    }

}
