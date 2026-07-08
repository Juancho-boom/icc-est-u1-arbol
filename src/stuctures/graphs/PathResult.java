package stuctures.graphs;

import java.util.List;

import stuctures.node.Node;

public class PathResult<T> {
    private final List<Node<T>> visitados;
    private final List<Node<T>> path;

    public PathResult(List<Node<T>> visitados, List<Node<T>> path) {
        this.visitados = visitados;
        this.path = path;
    }

    public List<Node<T>> getVisitados() {
        return visitados;
    }

    public List<Node<T>> getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "PathResult [visitados=" + visitados +
            "\n"+(!path.isEmpty() 
            ? " path=" + path   
            :  "No se encontro un camino entre los nodos");
    }
     
    
}
