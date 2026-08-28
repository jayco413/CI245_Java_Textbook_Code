import java.util.Objects;

public class Edge {

    private Object fromVertex;
    private Object toVertex;
    private double weight;

    public Edge(Object fromVertex, Object toVertex) {
        this(fromVertex, toVertex, 1.0);
    }

    public Edge(Object fromVertex, Object toVertex, double weight) {
        this.fromVertex = fromVertex;
        this.toVertex = toVertex;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        // ADD YOUR CODE HERE
        return false;
    }

    public boolean equalsIgnoreDirection(Object obj) {
        // ADD YOUR CODE HERE
        return false;
    }

    public Object getFromVertex() {
        return fromVertex;
    }

    public Object getToVertex() {
        return toVertex;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFromVertex(), getToVertex(), getWeight());
    }

    public void setFromVertex(Object fromVertex) {
        this.fromVertex = fromVertex;
    }

    public void setToVertex(Object toVertex) {
        this.toVertex = toVertex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        // ADD YOUR CODE HERE
        return null;
    }
}
