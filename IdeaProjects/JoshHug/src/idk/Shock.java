package idk;
    public class Shock {

        public static void main(String[] args) {
            int a = 6;
            int b = 7;
            swap(a, b);
            System.out.println(a + " " + b);
        }

        public static void swap (int A, int B) {
            int temp = B;
            B = A;
            A = temp;
        }
 }

