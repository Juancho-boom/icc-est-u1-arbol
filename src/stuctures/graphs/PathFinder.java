package stuctures.graphs;

import stuctures.node.Node;

// Interface => No contienen logica alterna
// Define los metodos
// No se puede instanciar

//Podemos usar caracteristicas de otras clases
public interface PathFinder<T> {
    PathResult<T> find(Graph<T> graph, T start, T end);  
}
