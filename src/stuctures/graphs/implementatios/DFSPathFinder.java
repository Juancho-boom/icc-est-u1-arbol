package stuctures.graphs.implementatios;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import stuctures.graphs.Graph;
import stuctures.graphs.PathFinder;
import stuctures.graphs.PathResult;
import stuctures.node.Node;

public class DFSPathFinder<T> implements PathFinder<T> {

    @Override
    public PathResult<T> find(Graph<T> graph, T start, T end) {
        Set<T> visited = new LinkedHashSet<>();
        List<T> path = new ArrayList<>();

        boolean encontrado = dfs(graph, start, end, visited, path);

        if (!encontrado) {
            path.clear();
        }

        return new PathResult<>(visited, new LinkedHashSet<>(path));
    }

    private boolean dfs(Graph<T> graph, T current, T end, Set<T> visited, List<T> path) {
        visited.add(current);
        path.add(current);
        
        if (current.equals(end)) {
            return true;
        }

        // Se usa current directamente si el método espera el valor T
        for (Node<T> vecino : graph.getVecinos(current)) {
            T valorVecino = vecino.getValue();
            
            if (!visited.contains(valorVecino)) {
                if (dfs(graph, valorVecino, end, visited, path)) {
                    return true;
                }
            }
        }
        
        path.remove(path.size() - 1);
        return false;
    }
}