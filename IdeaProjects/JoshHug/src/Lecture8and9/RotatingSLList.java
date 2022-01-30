package Lecture8and9;

public class RotatingSLList <Item> extends SLList<Item>{

    public void rotateRight(){
        Item x = removeLast();
        addFirst(x);
    }

    public static void main(String[] args) {
        RotatingSLList<Integer> rsl = new RotatingSLList<>();
        rsl.addLast(10);
        rsl.addLast(20);
        rsl.addLast(30);
        rsl.addLast(40);

        rsl.rotateRight();
        rsl.print();
    }
}
