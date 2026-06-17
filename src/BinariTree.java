public class BinariTree<T> {

    private Node<T> root;

    public BinariTree() {
        this.root = null;
    }


    public void insert(T value) {
        root = insertRecursive(root, value);
    }

    private Node<T> insertRecursive(Node<T> current, T value) {
        if (current == null) {
            return new Node<>(value);
        }

        Comparable<T> comparableValue = (Comparable<T>) value;

        if (comparableValue.compareTo(current.getValue()) < 0) {
            current.setLeft(insertRecursive(current.getLeft(), value));
        } else if (comparableValue.compareTo(current.getValue()) > 0) {
            current.setRight(insertRecursive(current.getRight(), value));
        }

        return current;
    }

    public void posOrder() {
        posOrderRecursive(root);
        System.out.println(); 
    }

    private void posOrderRecursive(Node<T> node) {
        if (node != null) {
            posOrderRecursive(node.getLeft());  
            posOrderRecursive(node.getRight()); 
            System.out.print(node.getValue() + " ");
        }
    }
}