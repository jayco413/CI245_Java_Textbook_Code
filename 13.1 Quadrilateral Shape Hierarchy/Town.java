public class Town extends Municipality {
    public Town(String name) {
        setName(name);
    }

    @Override
    public void display() {
        System.out.println("Town of " + getName());
    }
}
