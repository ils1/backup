package Lesson16Nov;

public class main {
    public static void main(String[] args) {
       BinarySearchTree<String> root = new BinarySearchTree<>("my string");

       root.insert("test");
        root.insert("break");
        root.insert("integer");

        root.print(0);

        BinarySearchTree<Integer> rootInt = new BinarySearchTree<>(100);

        rootInt.insert(150);
        rootInt.insert(80);
        rootInt.insert(90);

        rootInt.print(0);

        rootInt = rootInt.remove(80);
        rootInt.print(0);




    }
}
