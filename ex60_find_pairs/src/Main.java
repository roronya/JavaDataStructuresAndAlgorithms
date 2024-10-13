import java.util.*;


public class Main {

    // WRITE FINDPAIRS METHOD HERE //
    //                             //
    //                             //
    //                             //
    //                             //
    /////////////////////////////////
    public static List<int[]> findPairs(int[] arr1, int[]arr2, int target) {
        /**
        List<int[]> result = new ArrayList<>();
        for (int a1: arr1) {
            for (int a2: arr2) {
                if (a1 + a2 == target) {
                    result.add(new int[]{a1, a2});
                }
            }
        }
        return result;
         */
        Set<Integer> set = new HashSet<>();
        for (int a1: arr1) {
            set.add(target - a1);
        }
        List<int[]> result = new ArrayList<>();
        for (int a2: arr2) {
            if (set.contains(a2)) {
                result.add(new int[]{target-a2, a2});
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]

        */

    }

}

