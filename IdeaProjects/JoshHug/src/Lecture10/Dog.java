package Lecture10;

import java.util.Comparator;

public class Dog implements Comparable<Dog>{
    private String name;
    private int size;
    public Dog(String n, int s){
        name = n;
        size = s;
    }
    public void bark(){
        System.out.println(name + " says: Bark!");
    }

    // negative if this dog is less than o dog
    public int compareTo(Dog uddaDog) {
        return this.size - uddaDog.size;
    }

    private static class NameComparator implements Comparator<Dog>{
        public int compare(Dog a, Dog b){
            return a.name.compareTo(b.name);}
    }
    public static Comparator<Dog> getNameComparator(){
        return new NameComparator();
    }
}
