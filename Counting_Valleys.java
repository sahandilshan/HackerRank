public class Counting_Valleys {

    static int countingValleys(int n, String s) {

        int valleys=0;
        int seaLvl=0;
        boolean inValley=false;
        for (int i=0;i<n;i++)
        {
            char step=s.charAt(i);
            if(step=='D')
                seaLvl--;
            else
                seaLvl++;

            if(seaLvl==-1)
                inValley=true;

            if(inValley==true && seaLvl==0)
            {
                inValley=false;
                valleys++;
            }
        }
        return valleys;
    }
}
