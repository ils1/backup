package Discussion5.ExamPrep.q1;
import java.util.*;

public class FilteredList<T> implements Iterable<T> {
    List<T> list;
    Predicate<T> pred;

    public FilteredList(List<T> L, Predicate<T> filter) {
        this.list = L;
        this.pred = filter;
    }

    @Override
    public Iterator<T> iterator() {
        return new FilteredListIterator(list, pred);
    }

    private class FilteredListIterator implements Iterator<T>{
        List<T> list;
        Predicate<T> pred;
        int index;
        public FilteredListIterator(List<T> l, Predicate<T> f){
            list = l;
            pred = f;
            index = 0;
        }
        @Override
        public boolean hasNext(){
            while (index < list.size() && !pred.test(list.get(index))){
                index += 1;
            }
            return index < list.size();
        }

        @Override
        public T next(){
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            index += 1;
            return list.get(index - 1);
        }
    }
}