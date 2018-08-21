public class Forming_a_Magic_Square {
    static int formingMagicSquare(int[][] s) {

        int[][] arr1 = new int[][]{
                { 8, 1, 6,},
                { 3, 5, 7, },
                { 4, 9, 2,},
        };

        int[][] arr2 = new int[][]{
                { 6, 1, 8,},
                { 7, 5, 3, },
                { 2, 9, 4,},
        };

        int[][] arr3 = new int[][]{
                { 4, 9, 2,},
                { 3, 5, 7, },
                { 8, 1, 6,},
        };

        int[][] arr4 = new int[][]{
                { 2, 9, 4,},
                { 7, 5, 3, },
                { 6, 1, 8,},
        };

        int[][] arr5 = new int[][]{
                { 8, 3, 4,},
                { 1, 5, 9, },
                { 6, 7, 2,},
        };

        int[][] arr6 = new int[][]{
                { 4, 3, 8,},
                { 9, 5, 1, },
                { 2, 7, 6,},
        };

        int[][] arr7 = new int[][]{
                { 6, 7, 2,},
                { 1, 5, 9, },
                { 8, 3, 4,},
        };

        int[][] arr8 = new int[][]{
                { 2, 7, 6,},
                { 9, 5, 1, },
                { 4, 3, 8,},
        };

        int min=sum(s,arr1);
        min=Math.min(sum(s,arr2),min);
        min=Math.min(sum(s,arr3),min);
        min=Math.min(sum(s,arr4),min);
        min=Math.min(sum(s,arr5),min);
        min=Math.min(sum(s,arr6),min);
        min=Math.min(sum(s,arr7),min);
        min=Math.min(sum(s,arr8),min);

        return  min;


    }

    private static int sum(int [][] arr1,int [][] arr2)
    {
        int diffeent=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                diffeent+=Math.abs(arr1[i][j]-arr2[i][j]);
            }
        }

        return diffeent;
    }
}
