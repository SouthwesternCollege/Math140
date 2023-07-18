package lab18;

import edu.princeton.cs.algs4.Graph;
//import edu.princeton.cs.algs4.In;

public class GraphClient {
    public static void main(String[] args) {
        // In input = new In("https://algs4.cs.princeton.edu/41graph/tinyG.txt");
        // Graph graph = new Graph(input);

        Graph graph = new Graph(13);

        graph.addEdge(0,2);
        graph.addEdge(11,12);
        graph.addEdge(9,10);
        graph.addEdge(0,6);
        graph.addEdge(7,8);
        graph.addEdge(9,11);
        graph.addEdge(5,3);
        graph.addEdge(0,5);
        graph.addEdge(4,3);
        graph.addEdge(0,1);
        graph.addEdge(9,12);
        graph.addEdge(6,4);
        graph.addEdge(5,4);

        System.out.println(graph);
    }

}
