public class _5_LongestPalindromicSubstring {
    public static String longestPalindrome(String s){
        char[] arr = s.toCharArray();
        StringBuilder max = new StringBuilder("");
        int left;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++){
            left = i;
            StringBuilder str = new StringBuilder();
            str.append(arr[left]);

            if (left != arr.length - 1) {
                int n = left + 1;
                while (n != arr.length - 1 && arr[left] != arr[n]) {
                    ++n;
                    right = n;
                }
            }
            if (left != arr.length - 1 && left != right) {
                while (left != arr.length - 1 && right != 0 && arr[left + 1] == arr[right - 1]) {
                    if (left == arr.length - 1) {
                        break;
                    } else {
                        str.append(arr[left + 1]);
                        left++;
                        right--;
                    }
                }
            }
            if (str.length() > max.length()){
                max = str;
            }
            right = arr.length - 1;
        }
        return max.toString();
    }

    public static void main(String[] args) {
        String str = "cbbd";
        String neww = longestPalindrome(str);
        System.out.println(longestPalindrome(neww));
    }
}
