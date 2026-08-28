public class Town extends Municipality {
    public Town(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Town of " + name);
    }
}
