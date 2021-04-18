package ConvertAStringToAnArray;

/** Write a function to split a string and convert it into an array of words.
 * For example:"Robin Singh" ==> ["Robin", "Singh"]"
 * I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
 * */

public class Solution {

    public static String[] stringToArray(String s) {
        //your code;
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        return words;
    }
}
