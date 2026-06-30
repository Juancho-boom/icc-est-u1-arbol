import java.util.Set;

import Collection.maps.Maps;
import Collection.set.Sets;
import models.Person;
import stuctures.trees.BinariTree;
import stuctures.trees.Ejercicio1;
import stuctures.trees.Ejercicio3;
import stuctures.trees.Ejercicio4;
import stuctures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runEjercicios();
        runPersonTree();
        runEjercicios3y4();
        runSets();
        runMap();
    }

    public static void runMap(){
        Maps maps = new Maps();
        maps.construirHashMap();
        maps.coLinkedHashMap();
        maps.cTreeMap();
        maps.eliminarDuplicadosAndSort(null);
    }

    private static void runSets(){
        Sets sets  = new Sets();

        System.out.println("HashSets"+ sets.construirHashSet());
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Tamaño: " + hashSet.size());
        System.out.println(hashSet.contains("F"));

        System.out.println("LinkedHashSet: " + sets.construirLinkedHashSet());
        Set<String> lhSet = sets.construirLinkedHashSet();
        System.out.println(lhSet);
        System.out.println("Tamaño: " + lhSet.size());
        System.out.println(lhSet.contains("A"));
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

    public static void runEjercicios(){
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[]{5,3,7,2,4,6,8};
        ejercicio1.insert(numeros);
    }

    public static void runEjercicios3y4() {
        BinariTree<Integer> arbolPrueba = new BinariTree<>();
        arbolPrueba.insert(10);
        arbolPrueba.insert(5);
        arbolPrueba.insert(20);
        arbolPrueba.insert(3);
        arbolPrueba.insert(8);
        arbolPrueba.insert(15);

        Integer buscar = 15;
        System.out.println("Buscando el numero: " + buscar);

        System.out.print("Ruta DFS: ");
        boolean encontradoDFS = Ejercicio3.dfs(arbolPrueba, buscar);
        System.out.println("\n¿Encontrado con DFS?: " + encontradoDFS);

        System.out.print("Ruta BFS: ");
        boolean encontradoBFS = Ejercicio4.bfs(arbolPrueba, buscar);
        System.out.println("\n¿Encontrado con BFS?: " + encontradoBFS);
    }
}
