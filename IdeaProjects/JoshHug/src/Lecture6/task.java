package Lecture6;

public class task {
    public static void main(String[] args) {
        int num = 100;
        int ans = 0;
        int i = 100;
        while (i < 1000) {
            num++;
            ans +=num;
            i++;
        }
        System.out.println(ans);
    }
}
