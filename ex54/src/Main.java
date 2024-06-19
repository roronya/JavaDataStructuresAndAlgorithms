import java.util.*;


public class Main {

    // WRITE FIRSTNONREPEATINGCHAR METHOD HERE //
    //                                         //
    //                                         //
    //                                         //
    //                                         //
    /////////////////////////////////////////////
    public static Character firstNonRepeatingChar(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (Character ch: str.toCharArray()) {
            if (hashMap.get(ch) == null) {
                hashMap.put(ch, 1);
            } else {
                hashMap.put(ch, hashMap.get(ch) + 1);
            }
        }
        for (Character ch: str.toCharArray()) {
            if (hashMap.get(ch) == 1) {
                return ch;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */

    }

}
