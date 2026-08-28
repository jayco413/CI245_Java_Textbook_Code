public class City extends Municipality {
    public City(String name) {
        setName(name);
    }

    @Override
    public void display() {
        System.out.println("City of " + getName());
    }

    public static void main(String[] args) {
        Municipality municipality = new Municipality("Upstate");
        Town town = new Town("New Hartford");
        City city = new City("Rome");
        Municipality cityAsMunicipality = city;

        System.out.println("Municipality display:");
        municipality.display();

        System.out.println("\nTown display:");
        town.display();

        System.out.println("\nCity display:");
        city.display();

        System.out.println("\nCity cast to Municipality display:");
        cityAsMunicipality.display();
    }
}
