public class Drawing_Book {

    static int pageCount(int n, int p) {

        int front=0,back;
        if(n%2==0)//to check whether if there is a back page available or not
        {
            if (p==n)
                return 0;
            back = 1;
            n--;
        }
        else
            back=0;

        int no=1;
        while(no<p)
        {
            no+=2;
            front++;
        }

        no=n-1;
        while(p<no)
        {
            no-=2;
            back++;
        }

        if(front<back)
            return front;

        return back;

    }
}
