/*

 */
public class _14_LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        int min = 0;
        for (int a = 0; a < strs.length; a++){
            if (strs[a].length() < strs[min].length()){
                min = a;
            }
        }
        for (int i = 0; i < strs[min].length(); i++){
            int n = 0;
            for (int j = 0; j < strs.length; j++){
                if (j != min) {
                    if (strs[j].charAt(i) == strs[min].charAt(i)) {
                        n += 1;
                    }
                }
            }
            if (n == strs.length - 1){
                str.append(strs[min].charAt(i));
            }
            else {
                break;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flowight"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }
}
