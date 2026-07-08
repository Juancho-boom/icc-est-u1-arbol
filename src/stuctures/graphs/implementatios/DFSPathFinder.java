package stuctures.graphs.implementatios;

import java.util.ArrayList;
import java.util.HashSet;
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
        Set<Node<T>> visited = new LinkedHashSet<>();
        List<Node<T>> path = new ArrayList<>();


        boolean encontrado = dfs(graph,start,end,visited,path);

        if (!encontrado) {
            path.clear();
        }

        return new PathResult<>(visited, path);

    }
    
    private boolean dfs(Graph<T> graph,
            T current, T end,
            List<T> visited,
            List<T> path){

        visited.add(current);
        path.add(current);

        Node<T> nC = new Node<T>(current);
        Node<T> nE = new Node<T>(end);
        if(nC.equals(nE)){
            return true;
        }

        for(Node<T> vecino : graph.getVecinos(current)){
            if( ! visited.contains(vecino.getValue())){
                boolean encon = dfs(graph,vecino.getValue(),end,visited,path);
                if (encon) {
                    return true;
                }
            }
        }
        
        return false;
    }

    @Override
    public String toString() {
        return "DFSPathFinder []";
    }
    
    
}
