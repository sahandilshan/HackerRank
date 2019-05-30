public class Save_the_Prisoner {
    static int saveThePrisoner(int n, int m, int s) {

        int index = m%n;
        if(index ==0)
            index = n;

        index += (s-1); //if s=3 then to get the 5th seat's prisoner id (5 +3-1)

        if(index>n)
            index-=n;

        return index;

    }
}
