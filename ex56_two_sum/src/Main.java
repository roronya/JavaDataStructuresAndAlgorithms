import java.util.*;


public class Main {

  // WRITE THE TWOSUM MEHTOD HERE //
  //                              //
  //                              //
  //                              //
  //                              //
  //////////////////////////////////
  public static int[] twoSum(int[] nums, int target) {
    for (int i=0;i<nums.length;i++) {
      for (int j=i+1;j<nums.length;j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i,j};
        }
      }
    }
    return new int[]{};

  }


  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
    System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
    System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
    System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));

        /*
            EXPECTED OUTPUT:
            ----------------
            [0, 1]
            [1, 2]
            [0, 1]
            []
            [2, 3]
            [0, 1]
            []

        */

  }

}
