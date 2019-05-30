import java.util.TreeMap;

public class Designer_PDF_Viewer {
    static int designerPdfViewer(int[] h, String word) {

        int area = 0;

        int maxHeigth = 0;
        for(char x:word.toCharArray())
        {
            int val = x-97; // a=97 in ascii
            System.out.println(val);
            if(h[val]>maxHeigth)
                maxHeigth=h[val];

        }

        area = maxHeigth*word.length();
        return area;
    }

}
