public class City extends Municipality {
    public City(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("City of " + name);
    }

    public static void main(String[] args) {
        Municipality municipality = new Municipality("Upstate");
        Town town = new Town("Rome");
        City city = new City("Syracuse");

        municipality.display();
        town.display();
        city.display();
    }
}
