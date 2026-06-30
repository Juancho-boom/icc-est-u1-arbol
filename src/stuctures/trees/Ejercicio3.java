package stuctures.trees;

import stuctures.node.Node;

public class Ejercicio3 {

    public static <T extends Comparable<T>> boolean dfs(BinariTree<T> tree, T target) {
        if (tree.isEmpty()) {
            return false;
        }
        return dfsRecursivo(tree.getRoot(), target);
    }

    public static boolean dfsInt(IntTree tree, Integer target) {
        if (tree.isEmpty()) {
            return false;
        }
        return dfsRecursivoInt(tree.getRoot(), target);
    }

    private static <T extends Comparable<T>> boolean dfsRecursivo(Node<T> actual, T target) {
        if (actual == null) return false;

        System.out.print(actual.getValue() + " -> ");

        if (actual.getValue().compareTo(target) == 0) return true;
        if (dfsRecursivo(actual.getLeft(), target)) return true;
        
        return dfsRecursivo(actual.getRight(), target);
    }

    private static boolean dfsRecursivoInt(Node<Integer> actual, Integer target) {
        if (actual == null) return false;

        System.out.print(actual.getValue() + " -> ");

        if (actual.getValue().equals(target)) return true;
        if (dfsRecursivoInt(actual.getLeft(), target)) return true;
        
        return dfsRecursivoInt(actual.getRight(), target);
    }
}