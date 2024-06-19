import java.util.*;


public class Main {

    // WRITE THE FINDDUPLICATES METHOD HERE //
    //                                      //
    //                                      //
    //                                      //
    //                                      //
    //////////////////////////////////////////
    public static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int n: nums) {
            Integer count = hashMap.get(n) == null ? 0 : hashMap.get(n);
            switch (count) {
                case 0:
                    hashMap.put(n, 1);
                    break;
                case 1:
                    hashMap.put(n, 2);
                    result.add(n);
                default:
                    hashMap.put(n, count+1);

            }
        }
        return result;
    }


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);

        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */

    }

}
