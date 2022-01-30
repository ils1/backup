import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }
        int numSwaps = 0;
        for (int i = 0; i < a.size(); i++){
            for (int j = 0; j < a.size() - 1; j++){
                if (a.get(j) > a.get(j+1)){
                    int temp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, temp);
                    numSwaps++;
                }
            }
            if(numSwaps == 0){
                break;
            }
        }
        System.out.println("Array is sorted in" +numSwaps+ "swaps");
        System.out.println("First element: " + a.get(0));
        System.out.println("Last element: " + a.get(a.size()-1));

        // Write your code here

        bufferedReader.close();
    }
}
