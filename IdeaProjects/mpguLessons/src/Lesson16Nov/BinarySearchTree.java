package Lesson16Nov;

public class BinarySearchTree<T extends Comparable<T>> {
    private BinarySearchTree<T> parent;
    private BinarySearchTree<T> left;
    private BinarySearchTree<T> right;
    private T data;


    public BinarySearchTree(BinarySearchTree<T> left, BinarySearchTree<T> right, T data){
        this.left = left;
        this.right = right;
        this.data = data;
    }
    public BinarySearchTree(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public BinarySearchTree<T> getParent() {
        return parent;
    }
    public BinarySearchTree<T> getLeft() {
        return left;
    }
    public BinarySearchTree<T> getRight() {
        return right;
    }
    public T getData() {
        return data;
    }

    public boolean insert(T value) {
        if (getData().compareTo(value) == 0) return false;
        else if (getData().compareTo(value) < 0) {
            if (getRight() != null) {
                return getRight().insert(value);
            }
            BinarySearchTree<T> newNode = new BinarySearchTree<T>(value);
            newNode.parent = this;
            right = newNode;
            return true;
        }
        else {
            if (getLeft() != null) {
                return getLeft().insert(value);
            }
            BinarySearchTree<T> newNode = new BinarySearchTree<T>(value);
            newNode.parent = this;
            left = newNode;
            return true;
        }
    }


    public boolean contains(T value) {
        return contains(this, value);
    }



    private static <T2 extends Comparable<T2>> boolean contains(BinarySearchTree<T2> root, T2 value) {
        if (root == null) return false;
        if (root.getData().compareTo(value) == 0) {
            return true;
        }
        else if (root.getData().compareTo(value) < 0) {
            return contains(root.getRight(), value);
        }
        else {
            return contains(root.getLeft(), value);
        }

    }

    public void print(int i) {
        if (getRight() != null)
            getRight().print(i + 1);
        for (int a = 0; a < i; ++a) System.out.print("-");
        System.out.print(getData());
        System.out.println();
        if (getLeft() != null)
            getLeft().print(i + 1);
    }

    public BinarySearchTree<T> min(){
        if (getLeft() == null)
            return this;
        return getLeft().min();
    }
    public BinarySearchTree<T> max(){
        if (getRight() == null)
            return this;
        return getRight().max();
    }

    public BinarySearchTree<T> remove(T value) {
        if (getData().compareTo(value) == 0) {
            return remove();
        }
        else if (getData().compareTo(value) < 0 && getRight() != null) {
            return getRight().remove(value);
        }
        else if (getData().compareTo(value) < 0 && getLeft() != null) {
            return getLeft().remove(value);
        }
        return getRoot();
    }

    private BinarySearchTree<T> getRoot() {
        if (getParent() == null)
            return this;
        return getParent().getRoot();
    }

    private BinarySearchTree<T> remove(){
        if(getRight() == null && getLeft() == null) {
            if (getParent() == null)
                return null;
            if (getParent().getLeft() == this)
                getParent().left = null;
            else
                getParent().right = null;
            return getRoot();
        }
        else if (getRight() != null && getLeft() == null) {
            if (getParent() == null) {
                getRight().parent = null;
                return getRight();
            }

            else if (getParent().getLeft() == this) {
                getRight().parent = getParent();
                getParent().left = getRight();
                return getRoot();
            }
            else
                getRight().parent = getParent();
                getParent().right = getRight();
            return getRoot();
        }
        else if (getRight() == null && getLeft() != null) {
            if (getParent() == null) {
                getLeft().parent = null;
                return getLeft();
            }

            else if (getParent().getLeft() == this) {
                getLeft().parent = getParent();
                getParent().left = getRight();
                return getRoot();
            }
            else
                getLeft().parent = getParent();
                getParent().right = getLeft();
                return getRoot();
        }
        else {
            var rMin = getRight().min();
            rMin.getParent().left = rMin.getRight();
            if (getParent() == null) {
                rMin.parent = null;
                rMin.right = getRight();
                rMin.left = getLeft();
                return rMin;
            }
            else if (getParent().getLeft() == this) {
                rMin.parent = getParent();
                getParent().left = rMin;
                rMin.right = getRight();
                rMin.left = getLeft();
                return rMin.getRoot();
            }
            else {
                rMin.parent = getParent();
                getParent().right = rMin;
                rMin.right = getRight();
                rMin.left = getLeft();
                return rMin.getRoot();
            }
        }
    }
}
