package problem_solving;

public class Viral_Advertising {
    static int viralAdvertising(int n) {
        int shared = 2;
        int total = 2;

        for(int i=1;i<n;i++)
        {
            shared = (shared*3)/2;
            total+=shared;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
    }
}
