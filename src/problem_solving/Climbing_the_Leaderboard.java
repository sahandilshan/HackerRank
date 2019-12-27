package problem_solving;

import java.util.*;

public class Climbing_the_Leaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        //find the 1st score position
        int [] ranks = new int[alice.length];
        int i=1;
        int rank=1;
        int rankVal = scores[0];

        while(i<scores.length && (alice[0]<scores[i]))
        {
            if (scores[i]<rankVal)
            {
                rank++;
                rankVal=scores[i];
            }
            i++;
        }


        //to set update the rank by one
        if(alice[0]!=rankVal)
        {
            rank++;
            rankVal=alice[0];
        }

//        System.out.println("1st Rank :"+rank+" :"+rankVal);
        ranks[0] = rank;
        i--;
//        System.out.println(i);
        for(int j=1;j<alice.length;j++)
        {
            while(i>=0 && alice[j]>=scores[i])
            {
                if(scores[i]>rankVal)
                {
                    rank--;
                    rankVal=scores[i];
                }
                i--;
            }
            if(i==-1)
            {
                rank=1;
            }
            else {
                if (scores[i] == alice[j]) {
                    rank--;
                    rankVal = alice[j];
                } else {
                    rankVal = alice[j];
                }
            }

//            System.out.println("Rank :"+rank+" :"+rankVal);
            ranks[j]=rank;
        }


        return ranks;
    }


    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }


        int [] test2 = new int[]{1,1};
        System.out.println(Arrays.toString(climbingLeaderboard(scores,alice)));



    }


}
