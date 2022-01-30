package Discussion3;

import java.util.Arrays;

public class Discussion {
//    public void insert(int item, int position){
//        List temp = first;
//        while(position - 1 != 0 && temp.next != null){
//            position--;
//            temp = temp.next;
//        }
//        List node = new List;
//        List nextt = temp.next;
//        temp.next = node;
//        node.next = nextt;
//    }
//
//    public void reverseRecur(){
//       reverseRecurHelper(head);
//       }
//
//       private void reverseRecurHelper(IntNode curr) {
//        if(curr == null) {
//            return;
//        }
//
//        if (curr.next == null) {
//            head = curr;
//            return;
//        }
//        reverseRecurHelper(curr.next);
//        curr.next.next = curr;
//        curr.next = null;
//    }

    //Array insert extra
    public static int[] insert(int[] arr, int item, int position) {
        int[] arr2 = new int[arr.length + 1];

        if (position > arr.length - 1){
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr2[arr2.length - 1] = item;
        }

        System.arraycopy(arr, 0, arr2, 0, position);
        arr2[position] = item;
        System.arraycopy(arr, position, arr2, position + 1, arr2.length - 1 - position);
        return arr2;
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
    }

    public static int[] replicate(int[] arr){
        int total = 0;
        for (int item: arr) {
            total += item;
        }
        int[] arr2 = new int[total];
        int a = 0;
        for (int i = 0; i < arr.length; i++){
            int j = arr[i];
            while (j != 0 ) {
                arr2[a] = arr[i];
                j--;
                a++;
            }
        }
        return arr2;
    }
    public static int factSum(int n){
        return (n * (n+1)) / 2;
    }

    public static int[] replicate2(int[] arr){
        int total = 0;
        for (int item: arr) {
            total += item;
        }
        int[] result = new int[total];
        int i = 0;
        for (int item: arr) {
            for (int counter = 0; counter < item; counter++) {
                result[i] = item;
                i++;
            }
        }
        return result;
    }

    public static int[] flatten(int[][] x){
        int totalLength = 0;
        for (int i = 0; i < x.length; i++) {
            totalLength += x[i].length;
        }
        int[] a = new int[totalLength];
        int aIndex = 0;
        for (int j = 0; j < x.length; j++){
            System.arraycopy(x[j], 0, a, aIndex, x[j].length);
            aIndex += x[j].length;
        }
        return a;
    }




    public static void main(String[] args) {
        int[][] arr = {{3,2,4}, {4,5,6}, {1,0, 92}, {3}};
        System.out.println(Arrays.toString(flatten(arr)));
    }
}
