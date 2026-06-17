
public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
    }

    private static void runIntTree() {
        IntTree arbolNumeros = new IntTree(); /// CLASE ARBOL

        arbolNumeros.insert(10);
        arbolNumeros.insert(5);
        arbolNumeros.insert(3);
        arbolNumeros.insert(8); /// INORDER 3, 5, 8, 10, 15, 20
        arbolNumeros.insert(20); /// POSTORDER 3 8 5 15 20 10
        arbolNumeros.insert(15); // ANCHURA O NIVELES: 10 5 20 3 8 15

        System.out.println("pre Order");

        arbolNumeros.preOrder();
        System.out.println("Pos Order");
        arbolNumeros.posOrder();
    }
    private static void runPersonTree(){
        BinariTree<Person> persoTree = new BinariTree<>();
        persoTree.insert(new Person("Alice", 30));
        persoTree.insert(new Person("Bob", 25));
        persoTree.insert(new Person("Diego", 35));
        persoTree.insert(new Person("Rafae", 35));
    }
}
