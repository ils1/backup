package Lecture11;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArraySet<T> implements Iterable<T>{
    private T[] items;
    private int size; // the next item to be added will be at position size

    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    /* Returns true if this map contains a mapping for the specified key.
     */
    public boolean contains(T x) {
        for (int i = 0; i < size; i += 1) {
            if (items[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    /* Associates the specified value with the specified key in this map. */
    public void add(T x) {
        if (x == null){
            throw new IllegalArgumentException("You can't add null to an ArraySet.");
        }
        if (contains(x)) {
            return;
        }
        items[size] = x;
        size += 1;
    }

    /* Returns the number of key-value mappings in this map. */
    public int size() {
        return size;
    }

    public Iterator<T> iterator(){
        return new ArraySetIterator();
    }

    private class ArraySetIterator implements Iterator<T>{
        private int wizPos;
        public ArraySetIterator(){
            wizPos = 0;
        }
        public boolean hasNext(){
            return wizPos < size;
        }
        public T next(){
            T returnItem = items[wizPos];
            wizPos++;
            return returnItem;
        }
    }

    public static void main(String[] args) {
        ArraySet<Integer> aset = new ArraySet<>();
        aset.add(5);
        aset.add(23);
        aset.add(42);

        Iterator<Integer> aseer = aset.iterator();
        while(aseer.hasNext()){
            int i = aseer.next();
            System.out.println(i);
        }

        for (int i : aset) {
            System.out.println(i);
        }
    }
}