import java.util.Arrays;


public class Main {

    // WRITE MERGE METHOD HERE //
    public static int[] merge(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                result[k] = array1[i];
                i++;
            } else {
                result[k] = array2[j];
                j++;
            }
            k++;
        }
        while (i < array1.length) {
            result[k] = array1[i];
            i++;
            k++;
        }
        while (j < array2.length) {
            result[k] = array2[j];
            j++;
            k++;
        }
        return result;
    }


    public static void main(String[] args) {

        int[] array1 = {1,3,7,8};
        int[] array2 = {2,4,5,6};

        System.out.println( Arrays.toString( merge(array1, array2) ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8]

         */

    }

}

