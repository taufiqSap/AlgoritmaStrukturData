import java.util.LinkedList;
import java.util.Scanner;

public class Graph {
    int vertex;
    LinkedList<Integer> list[];
    boolean isDirected;

    public Graph(int vertex, boolean isDirected) {
        this.vertex = vertex;
        this.isDirected = isDirected;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        // add edge
        list[source].addFirst(destination);

        // add back edge (for undirected)
        if (!isDirected) {
            list[destination].addFirst(source);
        }
    }

    public void degree(int source) {
        // degree undirected graph
        System.out.println("Degree vertex " + source + " : " + list[source].size());

        // degree directed graph
        int totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source)
                    ++totalIn;
            }
            totalOut += (i == source) ? list[source].size() : 0; // fix for calculating totalOut
        }
        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("Degree vertex " + source + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int source, int destination) {
        if (list[source].contains(destination)) {
            list[source].remove(Integer.valueOf(destination)); // remove the destination from the source's adjacency list
    
            if (!isDirected && list[destination].contains(source)) {
                list[destination].remove(Integer.valueOf(source));
            }
    
            System.out.println("Edge removed: (" + source + " -> " + destination + ")");
        } else {
            System.out.println("Edge not found: (" + source + " -> " + destination + ")");
        }
    }
    

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.println(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean graphType() {
        return isDirected;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Get the number of vertices
        System.out.print("Masukkan jumlah vertices: ");
        int vertices = scanner.nextInt();

        // Get the type of graph
        System.out.print("Masukkan jenis graph (true untuk directed, false untuk undirected): ");
        boolean isDirected = scanner.nextBoolean();

        Graph graph = new Graph(vertices, isDirected);

        // Get the number of edges
        System.out.print("Masukkan jumlah edges: ");
        int edges = scanner.nextInt();

        // Input edges
        System.out.println("Masukkan edges (source destination): ");
        for (int i = 0; i < edges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }

        // Print the graph
        System.out.println("Graph:");
        graph.printGraph();

        // Get and print the degree of a vertex
        System.out.print("Masukkan the vertex untuk degree: ");
        int vertexToGetDegree = scanner.nextInt();
        graph.degree(vertexToGetDegree);

        // Close the scanner
        scanner.close();
    }
}
