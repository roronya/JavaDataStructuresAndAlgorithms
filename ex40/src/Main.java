public class Main {

    // WRITE THE REVERSESTRING METHOD HERE //
    //                                     //
    //                                     //
    //                                     //
    //                                     //
    /////////////////////////////////////////
    public static String reverseString(String str) {
        Stack<Character> stringStack = new Stack<>();
        for (int i = 0; i < str.length();i++) {
            stringStack.push(str.charAt(i));
        }
        String result = "";
        while(!stringStack.isEmpty()) {
            result += stringStack.pop().toString();
        }
        return result;
    }



    public static void main(String[] args) {

        Main myMain = new Main();
        String reversedString = myMain.reverseString("hello");
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

    }

}
