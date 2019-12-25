package problem_solving;

public class Angry_Professor {
    static String angryProfessor(int k, int[] a) {

        int count = 0;
        for (int x:a)
        {
            if(x<=0)
                count++;
        }

        if(count>=k)
            return "NO";
        return "YES";

    }
}
