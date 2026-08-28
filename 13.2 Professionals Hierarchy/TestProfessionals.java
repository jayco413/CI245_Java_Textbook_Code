public class TestProfessionals {

    public static void main(String[] args) {
        Professional[] professionals = {
            new Professional(),
            new Doctor(),
            new Lawyer(),
            new Accountant(),
            new Judge(),
            new SoftwareEngineer()
        };

        for (Professional professional : professionals) {
            System.out.println(professional.goToWork());
        }
    }
}
