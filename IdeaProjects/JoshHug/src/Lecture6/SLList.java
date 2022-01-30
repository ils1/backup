package Lecture6;

import java.util.Arrays;

public class SLList {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(factorial(3));
        System.out.println(Arrays.toString(replicate(arr)));
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp;
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    public static int factorial(int x) {
        if (x == 1) return 1;
        else return x + factorial( x - 1);
    }

    public static int[] replicate(int[] arr) {
        int total = 0;
        for (int item : arr) {
            total += item;
        }
        int[] result = new int[total];
        int i = 0;
        for (int item : arr) {
            for (int counter = 0; counter < item; counter++) {
                result[i] = item;
                i++;
            }
        }
        return result;
    }
}
