package Discussion5.ExamPrep.q3;
import idk.IntList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class KthIntList implements Iterator <Integer>{
    public int k;
    private IntList curList;
    private boolean hasNext;

    public KthIntList(IntList I, int k){
        this.k = k;
        this.curList = I;
        this.hasNext = true;
    }

    /*
    Returns true if there is next Kth element.
     */
    public boolean hasNext(){
        return this.hasNext;
    }

    /*
    Returns the next Kth element of the IntList.
    Returns the 0th element first.
    Throws a NoSuchElementException if there are
    no integers available to return
     */
    public Integer next(){
        if (curList == null){
            throw new NoSuchElementException();
        }
        Integer toReturn = curList.first;
        for (int i = 0; i < k && curList != null; i++){
            curList = curList.rest;
        }
        hasNext = (curList != null);
        return toReturn;
    }

}
