# Ejercicio 1
Insetcion de un BTS e impresion en consola de manera vertical
    
    public void insert(int[] numeros) {
        
        //Creamos el arbol de enteros
        BinariTree<Integer> tree = new BinariTree<>();
        
        //Instertar cada numero
        for (int numero : numeros) {
            tree.insert(numero);
        }
        
        //Imprimir el arbol
        printTree(tree.getRoot());
    }
##### Este emtodo insterta lso numeros de un arbol binario de de busqueda y  luego imprime el arbol en orden. La funcion *printTree* se encarga de imprimir el arbol de manera vertical, mostrando la estructura del mismo 

    
    private void printTreeRecursivo(Node<Integer> actual, int nivel) {
        
        if (actual == null) {
            return;
        }

        //#1 imprime el subarbol derecho
        printTreeRecursivo(actual.getRight(), nivel + 1);

        //Espacios segun el nivel
        for (int i = 0; i < nivel; i++) {
            System.out.print("    ");
        }

        //Imprime el valor nodo
        System.out.println(actual.getValue());

        //Luego imprime el subarbol izquierdo
        printTreeRecursivo(actual.getLeft(), nivel + 1);
        //Luego imprime el subarbol derecho
        printTreeRecursivo(actual.getRight(), nivel+1);
    }