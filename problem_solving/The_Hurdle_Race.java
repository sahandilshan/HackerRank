package problem_solving;

public class The_Hurdle_Race {
    static int hurdleRace(int k, int[] height) {

        int max = height[0];
        for(int i=1;i<height.length;i++)
        {
            if(height[i]>max)
                max=height[i];
        }

        return max-k<0?0:max-k;

    }

}
