package phone_book_core;

import phone_book_core.service.ArgumentErrorChecker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class PhoneBook {
    private HashMap<String, List<String>> data;
    private PhoneBook(){
        data = new HashMap<>();
    }



    public void addContact(String name, String phone){
        new ArgumentErrorChecker()
                .addCheck(name, "Name can not be null", Objects::isNull)
                .addCheck(name, "Phone can not be null", Objects::isNull)
                .check();

        StringBuilder error = new StringBuilder();
        if (name == null)
            error.append("Name can not be null\n");
        if (phone == null)
            error.append("Phone can not be null\n");
        if (!error.isEmpty())
            throw new IllegalArgumentException(error.toString());

        if (!data.containsKey(name)) {
            data.put(name, new ArrayList<>());
        }
        data.get(name).add(phone);
    }

    public int getContactsCount(){
        return data.size();
    }

    public static PhoneBook create(){
        return new PhoneBook();
    }

    public List<String> getPhonesForName(String name) {
        StringBuilder error = new StringBuilder();
        if (name == null)
            error.append("Name can not be null\n");
        if (!error.isEmpty())
            throw new IllegalArgumentException(error.toString());

        if(!data.containsKey(name))
            return new ArrayList<>();

        return new ArrayList<>(data.get(name));
    }
}
