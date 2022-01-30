package Discussion4.ExamPrep;

public class DMSList {
    private IntNode sentinel;
    public DMSList(){
        sentinel = new IntNode(-1000, null);
    }
    public class IntNode{
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode h){
            item = i;
            next = h;
        }
        public int max(){
            return Math.max(item, next.max());
        }
    }
//    public {
//
//    }
    //returns 0 if list is empty. Otherwise, returns the max element
    public int max(){
        if (sentinel.next == null){
            return 0;
        }
        else return sentinel.next.max();
    }
}
