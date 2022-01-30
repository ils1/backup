package Discussion5.Iterators.q2;
import java.util.Iterator;

public class OfficeHoursQueue implements Iterable<OHRequest> {
    OHRequest queue;
    public OfficeHoursQueue(OHRequest queue){
        this.queue = queue;
    }
    @Override
    public Iterator<OHRequest> iterator() {
        return new TYIterator(queue);
    }

    public static void main(String[] args) {
        OHRequest s1 = new OHRequest("faling", "Pam", null);
        OHRequest s2 = new OHRequest("conceptual", "Mich", s1);
        OHRequest s3 = new OHRequest("gitusiy", "J", s2);
        OHRequest s4 = new OHRequest("thank u", "Dw", s3);
        OHRequest s5 = new OHRequest("thank u", "Cr", s4);
        OfficeHoursQueue q = new OfficeHoursQueue(s5);
        for (OHRequest request : q) {
            System.out.println(request.description);
        }
    }
}
