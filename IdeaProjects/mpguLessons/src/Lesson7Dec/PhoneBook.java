package Lesson7Dec;

public class PhoneBook {
    private int contactsCnt;
    public PhoneBook(){
        contactsCnt = 0;
    }
    public void add(String name, String phone) {
        contactsCnt++;
    }
    public int getContactsCount() {
        return contactsCnt;
    }
}
