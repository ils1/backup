package Lecture8and9;

public class VengefulSLList<Item> extends SLList<Item> {
    SLList<Item> deletedItems;
    public VengefulSLList(){
        super();
        deletedItems = new SLList<>();
    }
    public VengefulSLList(Item x){
        super(x);
        deletedItems = new SLList<>();
    }
    @Override
    public Item removeLast(){
        Item x = super.removeLast();
        deletedItems.addLast(x);
        return x;
    }
    public void printLostItems() {
        deletedItems.print();
    }

    public static void main(String[] args) {
        VengefulSLList<Integer> vs1 = new VengefulSLList<>(0);
        vs1.addLast(1);
        vs1.addLast(2);
        vs1.addLast(3);
        vs1.addLast(4);

        vs1.removeLast();
        vs1.removeLast();

        System.out.println("The fallen are: ");
        vs1.printLostItems();

    }
}
