public class _6_ZigzagConversion {
    public static String convert(String s, int numRows){
        int zigzag = numRows - 2;
        for (int i = 0; i <= numRows; i++){
            for (int j = 0; j <= numColumns(s.length(), numRows); j++){

            }
        }
        return null;
    }

    public static int numColumns(int numLetters, int numRows){
        int count = 0;
        int zigzag = numRows - 2;
        while (numLetters > 0){
            numLetters = numLetters - numRows;
            count++;
            numLetters = numLetters - zigzag;
            count = count + zigzag;
        }
        return count - zigzag;
    }

    public static void main(String[] args) {
        int n = numColumns(6, 6);
        System.out.println(n);
    }
}
