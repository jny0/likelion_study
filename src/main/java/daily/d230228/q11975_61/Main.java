package daily.d230228.q11975_61;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList test = new ArrayList();

        test.add(0, "a");    // test = ["a"]
        test.add(1, "b");    // test = ["a","b","c"]
        test.add(2, "c");    // test = ["a","b","c"]
        System.out.println(test);

        test.size();          // 3
        test.contains("a");     // true
        test.contains("d");      // false

        String result = String.join(",",test);  // a,b,c
        test.sort(Comparator.reverseOrder());    // test = ["c","b","a"]
        test.sort(Comparator.naturalOrder());    // test = ["a","b","c"]

        test.remove("a");      // true / test = ["b","c"]
        test.remove(0);     // b / test = ["c"]
        System.out.println(test);

    }
}