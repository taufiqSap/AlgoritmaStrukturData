import java.util.LinkedList;

public class Graph {
    int vertex;
    LinkedList<Integer> list[];

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        // add edge
        list[source].addFirst(destination);

        // add back edge (for undirected)
        list[destination].addFirst(source);
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
        list[source].remove(Integer.valueOf(destination)); // remove the destination from the source's adjacency list
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

    public static void main(String[] args) throws Exception {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 0);
        graph.removeEdge(1, 2);
        graph.printGraph();
        graph.degree(2);
    }
}