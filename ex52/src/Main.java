import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Main {

    // WRITE THE ITEMINCOMMON METHOD HERE //
    //                                    //
    //                                    //
    //                                    //
    //                                    //
    ////////////////////////////////////////
    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int a: array1) {
            hashMap.put(a, true);
        }
        for (int a: array2) {
            if (hashMap.get(a) != null) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon(array1, array2));

        /*
            EXPECTED OUTPUT:
            ----------------
            true

        */

    }

}