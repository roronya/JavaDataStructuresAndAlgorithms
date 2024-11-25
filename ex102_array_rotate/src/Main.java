import java.util.Arrays;

public class Main {

    // WRITE THE ROTATE METHOD HERE //
    public static void myRotate(int[] nums, int k) {
        k = k % nums.length;
        for (int i=0;i<k;i++) {
            int tail = nums[nums.length-1];
            for (int j=nums.length-1;j>=1;j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = tail;
        }
    }

    // rotateできるということは、先端と末尾はつながっていると考えられる。
    // 透明なテープに文字が書いてあって輪っかになっているところを想像する。
    // kの部分でハサミでちょん切るシーンを考える。そうすると、裏返しだが、必要な文字列が手に入る。
    // もとに戻すために裏返す。
    public static void rotate(int[] nums, int k) {
        // System.out.println(Arrays.toString(nums));
        k = k % nums.length;
        if (k == 0) return;
        for (int start=0, end=k; start < end; start++, end--) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
        }
        // System.out.println(Arrays.toString(nums));
        for (int start=k+1, end=nums.length-1; start < end; start++, end--) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
        }
        // System.out.println(Arrays.toString(nums));
        for (int start=0, end=nums.length-1; start < end; start++, end--) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
        }
    }



    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        /**
        {4,3,2,1,7,6,5}
        {6,5,7,1,2,3,4}
         **/
        int k1 = 3;
        rotate(nums1, k1);
        System.out.println("Test case 1: Rotated array: " + Arrays.toString(nums1));  // prints "Rotated array: [5, 6, 7, 1, 2, 3, 4]"

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotate(nums2, k2);
        System.out.println("Test case 2: Rotated array: " + Arrays.toString(nums2));  // prints "Rotated array: [3, 99, -1, -100]"

        int[] nums3 = {1, 2};
        int k3 = 3;
        rotate(nums3, k3);
        System.out.println("Test case 3: Rotated array: " + Arrays.toString(nums3));  // prints "Rotated array: [2, 1]"

        int[] nums4 = {1};
        int k4 = 0;
        rotate(nums4, k4);
        System.out.println("Test case 4: Rotated array: " + Arrays.toString(nums4));  // prints "Rotated array: [1]"

        int[] nums5 = {1, 2, 3, 4, 5, 6};
        int k5 = 6;
        rotate(nums5, k5);
        System.out.println("Test case 5: Rotated array: " + Arrays.toString(nums5));  // prints "Rotated array: [1, 2, 3, 4, 5, 6]"

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: Rotated array: [5, 6, 7, 1, 2, 3, 4]
            Test case 2: Rotated array: [3, 99, -1, -100]
            Test case 3: Rotated array: [2, 1]
            Test case 4: Rotated array: [1]
            Test case 5: Rotated array: [1, 2, 3, 4, 5, 6]
        */

    }

}