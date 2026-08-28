public class GraphTest {
    public static void main(String[] args) {
        Graph g = new Graph();

        System.out.println("Testing adding vertices and edges");
        System.out.println();

        g.addVertex("a");
        g.addVertex("b");
        g.addVertex("c");
        g.addVertex("d");

        g.addEdge("a", "b");
        g.addEdge("a", "c", 3.0);
        g.addEdge("a", "d", 5.0, false);
        g.addEdge("c", "d");

        System.out.println(g);
        System.out.println();

        System.out.println("Edge count: " + g.getEdgeCount(false));
        System.out.println("Edge count (ignore bidirectional): "
            + g.getEdgeCount());

        System.out.println("Edge List: " + g.getEdgeList());

        System.out.printf("Edge Weight from a to c: %.2f%n",
            g.getEdgeWeight("a", "c"));

        System.out.println("Vertex Count: " + g.getVertexCount());
        System.out.println("Vertex List: " + g.getVertexList());

        System.out.println("Edge exists a to c: " + g.hasEdge("a", "c"));
        System.out.println("Edge exists b to c: " + g.hasEdge("b", "c"));
        System.out.println("Edge exists a to c: "
            + g.hasEdge(new Edge("a", "c")));
        System.out.println("Edge exists b to c: "
            + g.hasEdge(new Edge("b", "c")));

        System.out.println("Vertex a exists: " + g.hasVertex("a"));
        System.out.println("Vertex e exists: " + g.hasVertex("e"));

        System.out.println();
        System.out.println("Removing vertex a...");

        g.removeVertex("a");
        System.out.println(g);
        System.out.println();

        System.out.println("Adding edges to delete...");

        g.addVertex("e");
        g.addVertex("f");
        g.addVertex("g");
        g.addVertex("h");
        g.addEdge("b", "e");
        g.addEdge("b", "f");
        g.addEdge("b", "g");
        g.addEdge("b", "h");
        System.out.println(g);
        System.out.println();

        System.out.println("Deleting edges...");

        g.removeEdge(new Edge("b", "e"));
        g.removeEdge(new Edge("b", "f"), false);
        g.removeEdge("b", "g");
        g.removeEdge("b", "h", false);
        System.out.println(g);
        System.out.println();
    }
}
