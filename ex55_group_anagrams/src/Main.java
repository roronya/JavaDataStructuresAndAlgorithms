import java.util.*;


public class Main {

    /**
     * 型宣言をvarで省略してしまうと、変数の型がArrayListになってしまうので、この関数のシグニチャと型が合わなくなってしまう。
     * varを使わずインタフェースのレベルの型宣言をしてあげること
     * @param strings
     * @return
     */
    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> groupAnagrams = new HashMap<>();

        for(String str: strings) {
            var chars = str.toCharArray();
            Arrays.sort(chars);
            var canonical = Arrays.toString(chars);

            if (groupAnagrams.containsKey(canonical)) {
                groupAnagrams.get(canonical).add(str);
            } else {
                List<String> group = new ArrayList<>();
                group.add(str);
                groupAnagrams.put(canonical, group);
            }
        }

        return new ArrayList<>(groupAnagrams.values());
    }

    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */

    }

}
