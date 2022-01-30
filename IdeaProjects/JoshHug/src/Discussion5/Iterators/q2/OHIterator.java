package Discussion5.Iterators.q2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OHIterator implements Iterator<OHRequest> {
    OHRequest curr;

    public OHIterator(OHRequest original){
        curr = original;
    }
    public boolean isGood(String description){
        return description != null && description.length() > 5;
    }

    @Override
    public boolean hasNext() {
        while (curr != null && !isGood(curr.description)){
            curr = curr.next;
        }
        return curr != null;
    }

    @Override
    public OHRequest next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        OHRequest currRequest = curr;
        curr = curr.next;
        return currRequest;
    }
}
