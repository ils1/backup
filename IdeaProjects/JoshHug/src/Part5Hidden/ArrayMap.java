package Part5Hidden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMap <K, V>{
    private K[] keys;
    private V[] values;
    int size;

    public ArrayMap(){
        keys = (K[]) new Object[100];
        values = (V[]) new Object[100];
        size = 0;
    }

    private int keyIndex(K key){
        for (int i = 0; i < size; i++){
            if (keys[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public boolean containsKey(K key){
        int index = keyIndex(key);
        return index > -1;
    }

    public void put (K key, V value){
        int index = keyIndex(key);
        if (index == -1){
            keys[size] = key;
            values[size] = value;
            size += 1;
            return;
        }
        values[index] = value;
        keys[index] = key;
    }

    public V get(K key){
        int index = keyIndex(key);
        return values[index];
    }

    public int size(){
        return size;
    }

    public List<K> keys(){
        List<K> keylist = new ArrayList<K>();
        for (int i = 0; i < keys.length; i++){
            keylist.add(keys[i]);
        }
        return keylist;
    }

    public static void main(String[] args) {
        ArrayMap<String, Integer> m = new ArrayMap<>();
        m.put("horse", 3);
        m.put("fish", 9);
        m.put("dog", 4);
    }
}
