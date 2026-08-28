public class Municipality {
    protected String name;

    protected Municipality(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Municipality of " + name);
    }
}
