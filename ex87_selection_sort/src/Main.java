import java.util.Arrays;


public class Main {

    // WRITE SELECTIONSORT METHOD HERE //
    public static void selectionSort(int[] a) {
        for(int i=0;i<a.length;i++) {
            var min = a[i];
            for(int j=i+1;j<a.length;j++) {
                if (a[j] < min) {
                    min = a[j];
                    a[j] = a[i];
                    a[i] = min;
                }
            }
        }
    }


    public static void main(String[] args) {

        int[] myArray = {4,2,6,5,1,3};

        selectionSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }

}