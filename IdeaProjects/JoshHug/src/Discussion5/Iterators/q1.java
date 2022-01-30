package Discussion5.Iterators;

import java.util.Iterator;

public class q1 implements Iterable<Integer> {
    //1.
    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
//2.
class test implements Iterator<Integer>{
    @Override
    public boolean hasNext(){
        return true;
    }
    @Override
    public Integer next(){
        return 3;
    }
}

