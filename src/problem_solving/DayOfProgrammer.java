package problem_solving;

public class DayOfProgrammer {

    static String dayOfProgrammer(int year) {

        String date="";
        if (year<1918)
        {
            if(year%4==0)
            {
                date="12.09."+year;
            }
            else
                date="13.09."+year;
        }
        else if(year==1918)
        {
            date="26.09.1918";
        }
        else
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    date="12.09."+year;
                }
                else
                {
                    date="13.09."+year;
                }
            }
            else
            {
                if(year%4==0)
                    date="12.09."+year;
                else
                    date="13.09."+year;
            }
        }
        return date;
    }
}
