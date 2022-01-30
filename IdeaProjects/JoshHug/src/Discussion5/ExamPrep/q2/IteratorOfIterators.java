package Discussion5.ExamPrep.q2;
import java.util.*;

public class IteratorOfIterators implements Iterator<Integer>{
    LinkedList<Integer> l;

    public IteratorOfIterators(List<Iterator<Integer>> a){
        l = new LinkedList<>();
        int i = 0;
        while (!a.isEmpty()){
            Iterator<Integer> curr = a.get(i);
            if (!curr.hasNext()){
                a.remove(curr);
                i -= 1;
            } else {
                l.add(curr.next());
            }
            if (a.isEmpty()){
                break;
            }
            i = (i + 1) % a.size();
        }
    }

    @Override
    public boolean hasNext() {
        return !l.isEmpty();
    }

    @Override
    public Integer next() {
        return l.removeFirst();
    }
}
