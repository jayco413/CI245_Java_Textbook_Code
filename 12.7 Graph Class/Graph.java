import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph {

    private HashMap<Object, HashSet<Edge>> adjacencyList = new HashMap<>();

    public void addEdge(Edge e) {
        addEdge(e, true);
    }

    public void addEdge(Edge e, boolean bidirectional) {
        // ADD YOUR CODE HERE
    }

    public void addEdge(Object fromVertex, Object toVertex) {
        addEdge(new Edge(fromVertex, toVertex), true);
    }

    public void addEdge(Object fromVertex, Object toVertex, double weight) {
        addEdge(new Edge(fromVertex, toVertex, weight), true);
    }

    public void addEdge(Object fromVertex, Object toVertex, double weight,
            boolean bidirectional) {
        addEdge(new Edge(fromVertex, toVertex, weight), bidirectional);
    }

    public void addVertex(Object vertex) {
        // ADD YOUR CODE HERE
    }

    public int getEdgeCount() {
        // ADD YOUR CODE HERE
        return 0;
    }

    public int getEdgeCount(boolean countBidirectionalAsOne) {
        // ADD YOUR CODE HERE
        return 0;
    }

    public List<Edge> getEdgeList() {
        // ADD YOUR CODE HERE
        return null;
    }

    public double getEdgeWeight(Edge e) {
        // ADD YOUR CODE HERE
        return 0;
    }

    public double getEdgeWeight(Object fromVertex, Object toVertex) {
        // ADD YOUR CODE HERE
        return 0;
    }

    public int getVertexCount() {
        // ADD YOUR CODE HERE
        return 0;
    }

    public Set<Object> getVertexList() {
        // ADD YOUR CODE HERE
        return null;
    }

    public boolean hasEdge(Edge e) {
        // ADD YOUR CODE HERE
        return false;
    }

    public boolean hasEdge(Object fromVertex, Object toVertex) {
        // ADD YOUR CODE HERE
        return false;
    }

    public boolean hasVertex(Object vertex) {
        // ADD YOUR CODE HERE
        return false;
    }

    public void removeEdge(Edge e) {
        removeEdge(e, true);
    }

    public void removeEdge(Edge e, boolean bidirectional) {
        // ADD YOUR CODE HERE
    }

    public void removeEdge(Object fromVertex, Object toVertex) {
        removeEdge(new Edge(fromVertex, toVertex), true);
    }

    public void removeEdge(Object fromVertex, Object toVertex, boolean bidirectional) {
        removeEdge(new Edge(fromVertex, toVertex), bidirectional);
    }

    public void removeEdge(Object fromVertex, Object toVertex, double weight) {
        removeEdge(new Edge(fromVertex, toVertex, weight), true);
    }

    public void removeEdge(Object fromVertex, Object toVertex, double weight,
            boolean bidirectional) {
        removeEdge(new Edge(fromVertex, toVertex, weight), bidirectional);
    }

    public void removeVertex(Object vertex) {
        // ADD YOUR CODE HERE
    }

    @Override
    public String toString() {
        // ADD YOUR CODE HERE
        return null;
    }
}
