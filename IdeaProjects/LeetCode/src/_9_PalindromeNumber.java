/*
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.
 */

public class _9_PalindromeNumber {
    public static boolean isPalindrome(int x){
        String s = String.valueOf(x);
        if (s.length() == 0 || s.length() == 1){
            return true;
        }
        if ((Integer)s.length() == null) {
            return false;
        }
        else {
            if (s.length() % 2 == 0){
                return helper(s, s.length()/2 - 1, s.length() / 2);
            }
            else {
                return helper(s, s.length()/ 2 - 1, s.length() / 2 + 1);
            }
        }
    }
    private static boolean helper(String s, int left, int right) {
            int n = 0;
            int k = 0;
            for (int i = right; i < s.length(); i++) {
                k += 1;
                if (s.charAt(left) == s.charAt(right)) {
                    n += 1;
                }
                left--;
                right++;
            }
        return n == k;
    }

    public static void main(String[] args) {
        boolean test = isPalindrome(1000021);
        System.out.println(test);
    }
}
