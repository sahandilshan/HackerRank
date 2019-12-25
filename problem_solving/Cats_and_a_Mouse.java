package problem_solving;

public class Cats_and_a_Mouse {
    static String catAndMouse(int x, int y, int z) {
        int catA,catB;
        catA=Math.abs(z-x);
        catB=Math.abs(z-y);

        if(catA<catB)
            return "Cat A";
        if(catB<catA)
            return "Cat B";

        return "Mouse C";

    }

}
