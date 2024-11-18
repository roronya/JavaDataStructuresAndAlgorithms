import java.util.Arrays;


public class Main {

    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                combined[index] = array2[j];
                index++;
                j++;
            }
        }
        while (i < array1.length) {
            combined[index] = array1[i];
            index++;
            i++;
        }
        while (j < array2.length) {
            combined[index] = array2[j];
            index++;
            j++;
        }
        return combined;
    }


    // WRITE MERGESORT METHOD HERE //
    public static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        if (array.length == 2) {
            return array[0] < array[1] ? array : new int[]{array[1], array[0]};

        }
        var mid = array.length / 2;
        var left = Arrays.copyOfRange(array, 0, mid);
        var right = Arrays.copyOfRange(array, mid, array.length);
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }


    public static void main(String[] args) {

        int[] originalArray = {3,1,4,2};

        int [] sortedArray = mergeSort(originalArray);

        System.out.println( "Original Array: " + Arrays.toString( originalArray ) );

        System.out.println( "\nSorted Array: " + Arrays.toString( sortedArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            Original Array: [3, 1, 4, 2]

            Sorted Array: [1, 2, 3, 4]

         */

    }

}
