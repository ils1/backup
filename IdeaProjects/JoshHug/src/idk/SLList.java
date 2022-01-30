package idk;

public class SLList<LochNess> {
    private class StuffNode {
        public LochNess item;
        public StuffNode next;

        public StuffNode(LochNess i, StuffNode n){
            item = i;
            next = n;
        }
    }

    private StuffNode sentinel;
    private int size;


    public SLList(LochNess x) {
        sentinel = new StuffNode(x, null);
        sentinel.next = new StuffNode(x, null);
        size = 1;
    }

    public void addFisrt(LochNess x) {
        sentinel.next = new StuffNode(x, sentinel.next);
        size++;
    }

    public LochNess getFirst() {
        return sentinel.next.item;
    }


    public void addLast(LochNess x) {
        size++;

        StuffNode p = sentinel;

        while (p.next != null) {
            p = p.next;
        }

        p.next = new StuffNode(x, null);
    }



    public int size(){
        return size;
     }

     public int size2(){
        StuffNode o = sentinel.next;
        int count = 0;
        while (o.next != null){
            o = o.next;
            count++;
        }
        return 1 + count;
     }


}
