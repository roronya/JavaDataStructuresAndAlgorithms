import java.util.Arrays;


public class Main {

    // WRITE INSERTIONSORT METHOD HERE //
    public static void insertionSort(int[] a) {
        if (a.length < 2) {
            return;
        }
        for (int i=1;i<a.length;i++) {
            for (int j=i;j>0;j--) {
                if (a[j-1] < a[j]) break;
                var tmp = a[j-1];
                a[j-1] = a[j];
                a[j] = tmp;
            }
        }
    }


    public static void main(String[] args) {

        int[] myArray = {4,2,6,5,1,3};

        insertionSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }

}