package phone_book_core.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class ArgumentErrorChecker {
    public ArgumentErrorChecker(){
        objects = new ArrayList<>();
        messages = new ArrayList<>();
        predicates = new ArrayList<>();
    }
    private List<Object> objects;
    private List<String> messages;
    private List<Predicate<Object>> predicates;
    public ArgumentErrorChecker addCheck(Object arg, String message, Predicate predicate) {
        objects.add(arg);
        messages.add(message);
        predicates.add(predicate);
        return this;
    }

    public void check() {
        StringBuilder error = new StringBuilder();
        for(int i = 0; i < objects.size(); ++i){
            if(predicates.get(i).test(objects.get(i)))
                error.append(messages.get(i)).append('\n');
        }
        if (!error.isEmpty())
            throw new IllegalArgumentException(error.toString());
    }
}
