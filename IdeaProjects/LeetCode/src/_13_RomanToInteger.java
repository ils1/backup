/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
 */
public class _13_RomanToInteger {
    public static int romanToInt(String s){
        int n = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'M'){
                n = n + 1000;
            }
            if (s.charAt(i) == 'D'){
                n = n + 500;
            }
            if (s.charAt(i) == 'C'){
                if (i != s.length() - 1 && s.charAt(i + 1) == 'D'){
                    n = n + 400;
                    i++;
                }
                else if (i != s.length() - 1 && s.charAt(i + 1) == 'M'){
                    n = n + 900;
                    i++;
                }
                else {
                    n = n + 100;
                }
            }
            if (s.charAt(i) == 'L'){
                n = n + 50;
            }
            if (s.charAt(i) == 'X'){
                if (i != s.length() - 1 && s.charAt(i + 1) == 'L'){
                    n = n + 40;
                    i++;
                }
                else if (i != s.length() - 1 && s.charAt(i + 1) == 'C'){
                    n = n + 90;
                    i++;
                }
                else {
                    n = n + 10;
                }
            }
            if (s.charAt(i) == 'V'){
                    n = n + 5;
            }
            if (s.charAt(i) == 'I'){
                if (i != s.length() - 1 && s.charAt(i + 1) == 'V'){
                    n = n + 4;
                    i++;
                }
                else if (i != s.length() - 1 && s.charAt(i + 1) == 'X'){
                    n = n + 9;
                    i++;
                }
                else {
                    n = n + 1;
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int x = romanToInt("MCMXCIV");
        System.out.println(x);
    }
}
