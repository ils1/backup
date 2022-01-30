import java.util.*;

public class Kata {
    public static boolean isPalindrome(String word) {
        int i = 0;
        if (word.length() == 1 || word.length() == 0) {
            return true;
        }
        for (int j = 0; j < word.length(); j++) {
            if(word.charAt(j) == word.charAt(word.length() - j -1)) {
                i += 1;
            }
            else {
                i += 0;
            }
        }
        return i == word.length();
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("cat"));
    }
}
