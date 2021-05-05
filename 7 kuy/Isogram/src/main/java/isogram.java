import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**An isogram is a word that has no repeating letters,
 * consecutive or non-consecutive.
 * Implement a function that determines whether
 * a string that contains only letters is an isogram.
 * Assume the empty string is an isogram.
 * Ignore letter case.
 *      isIsogram "Dermatoglyphics" == true
 *      isIsogram "aba" == false
 *      isIsogram "moOse" == false -- ignore letter case
 **/

public class isogram {
    public static boolean  isIsogram(String str) {
        // ...
        String[] strings = str.toLowerCase().split("");
        Set<String> set = new HashSet<>(Arrays.asList(strings));
        if (str.length() == set.size() || str.equals("")) return true;
        return false;
    }
}