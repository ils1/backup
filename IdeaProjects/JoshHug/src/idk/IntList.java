package idk;

public class IntList {

    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }

    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    public int iterativeSize(){
        IntList p = this;
        int totalSize = 0;
        while (p != null ) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    public int get(int g) {
        int gett = g;
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            if (gett == totalSize) {return p.first; }
            else {
                totalSize += 1;
                p = p.rest;
            }
        }
            return 8;
    }

    public static IntList square(IntList L) {
    IntList B  = L;
    if (B == null) {
        return B;
    }
    else {


    }
//    while (B != null ){
//        B.first *= B.first;
//        B = B.rest;
//        }
    return L;
    }




//    public static IntList squareDestructive(IntList L) {
//
//    }

    public void skippify(){
        IntList p = this;
        int n = 1;
        while (p != null) {
            IntList next = p.rest;
            for (int i = 0; i < n; i += 1) {
                if (next == null) {
                    break;
                }
                next = next.rest;
            }
            p.rest = next;
            p = p.rest;
            n++;
        }
    }

    public static IntList ilsans(IntList x, int y) {
        if (x == null) {
            return null;
        }
        if (x.first == y) {
            return ilsans(x.rest, y);
        }
        return new IntList(x.first, ilsans(x.rest, y));
    }

    public static IntList dilsans(IntList x, int y){
        if (x == null) {
            return null;
        }
        x.rest = dilsans(x.rest, y);
        if(x.first == y) {
            return x.rest;
        }
        return x;
    }


    public static void main(String[] args) {
        IntList l = new IntList(15, null);
        l = new IntList(14, l);
         l = new IntList(7, l);
        l = new IntList(12, l);
        l = new IntList(7, l);
        l = new IntList(10, l);
        l = new IntList(9, l);
        l = new IntList(7, l);
        l = new IntList(7, l);
        l = new IntList(6, l);
        l = new IntList(5, l);


//        for (int i = 0; i < 10; i++) {
//            System.out.println(ilsans(l, 7).get(i));
//        }
        dilsans(l, 7);
        for (int i = 0; i < 10; i++) {
            System.out.println(l.get(i));
        }

    }
}


