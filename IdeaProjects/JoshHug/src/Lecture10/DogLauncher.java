package Lecture10;

import java.util.Comparator;

public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog("Elya", 3);
        Dog d2 = new Dog("Elyb", 9);
        Dog d3 = new Dog("Elyc", 14);
        Dog[] dogs = new Dog[]{d1, d2, d3};
        System.out.println(Maximizer.max(dogs));
        Dog d = (Dog) Maximizer.max(dogs);
        d.bark();

        Comparator<Dog> nc = Dog.getNameComparator();
        if (nc.compare(d1, d2) > 0){ // d1 later in the alphabet
            d1.bark();
        }
        else {
            d3.bark();
        }
    }
}
