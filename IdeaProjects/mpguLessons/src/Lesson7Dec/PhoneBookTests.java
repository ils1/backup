package Lesson7Dec;

import org.junit.Assert;
import org.junit.Test;

public class PhoneBookTests extends Assert {
        @Test
        public void add_addFirstContactWithCorrectNameAndPhone_contactsCountEqualsOne(){
                PhoneBook phoneBook = new PhoneBook();
                phoneBook.add("name", "phone");
                assertEquals(1, phoneBook.getContactsCount());
        }
        @Test
        public void PhoneBook_CreateNew_contactsCountEqualsZero(){
                PhoneBook phoneBook = new PhoneBook();
                assertEquals(0, phoneBook.getContactsCount());
        }
}
