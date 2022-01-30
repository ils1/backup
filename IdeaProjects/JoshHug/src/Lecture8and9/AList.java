package Lecture8and9;

public class AList<Item> implements List61B<Item>{
    private int size;
    private Item[] items;

    public AList() {
        items = (Item[]) new Object[100];
        size = 0;
    }
    private void resize(int capacity) {
            Item[] a = (Item[]) new Object[capacity];
            System.arraycopy(items, 0 , a , 0 , size);
            items = a;
    }

    public void addLast(Item x) {
        if(size == items.length) {
            resize(size + 1);
        }
        items[size]= x;
        size++;
    }
    public Item getLast(){
        return items[size - 1];
    }

    public Item get(int i) {
        return items[i];
    }
    public int size() {
        return size;
    }
    public Item removeLast(){
        Item x = getLast();
        size = size - 1;
        return x;
    }

    @Override
    public void insert(Item x, int position) {

    }

    @Override
    public void addFirst(Item x) {

    }

    @Override
    public Item getFirst() {
        return null;
    }

}
