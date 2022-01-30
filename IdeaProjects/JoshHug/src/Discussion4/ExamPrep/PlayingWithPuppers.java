package Discussion4.ExamPrep;

public class PlayingWithPuppers {
    /*
    2 C1 +?
    3 C1 +?
    4 D1 +
    5 COMPILE-ERROR +
    6 c1 ---

    8 runtime +?
    9 runtime +?
    10 D +
    11 E +
    12 C +
    13 A -B
    14 A -C
    15 compile-error +
    16 B -runtime
     */
    public static void main(String[] args) {
        A a = (A) new PlayingWithPuppers();
    }
}
class A extends PlayingWithPuppers{

}

