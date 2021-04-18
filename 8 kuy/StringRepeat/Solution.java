package StringRepeat;

/** Write a function called repeat_string which repeats the given string str exactly count times.
 * repeatStr(6, "I") // "IIIIII"
 * repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 * */

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String result = "";
        for (int i = 0; i < repeat; i ++) {
            result = result + string;
        }
        return result;
    }
}
