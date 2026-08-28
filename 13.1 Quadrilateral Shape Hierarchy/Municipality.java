public class Municipality {
    private String name;

    public Municipality() {
    }

    public Municipality(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Municipality of " + name);
    }
}
