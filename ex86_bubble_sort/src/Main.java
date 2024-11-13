import java.util.Arrays;


public class Main {

    // WRITE BUBBLESORT METHOD HERE //
    public static void bubbleSort(int[] a) {
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<i;j++) {
                if(a[i] < a[j]) {
                    var tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }


    public static void main(String[] args) {

        int[] myArray = {4,2,6,5,1,3};

        bubbleSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }

}