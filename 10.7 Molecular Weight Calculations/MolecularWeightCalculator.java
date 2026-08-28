import java.math.BigDecimal;
import java.util.Scanner;
import java.util.TreeMap;

public class MolecularWeightCalculator {

    private static TreeMap<String, String> eaw = new TreeMap<>();

    public static void main(String[] args) {
        setUpWeights();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a compound (Q to quit): ");
            String compound = scanner.nextLine();

            if (compound.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                BigDecimal molecularWeight = getMolecularWeight(compound);
                System.out.println("Molecular weight: " + molecularWeight);
            } catch (Exception ex) {
                System.out.println("Invalid formula! " + ex.getMessage());
            }
        }
    }

    private static BigDecimal getMolecularWeight(String compound) {
        // ADD YOUR CODE HERE
        return null;
    }

    public static void setUpWeights() {
        eaw.put("H", "1.00794"); eaw.put("He", "4.002602");
        eaw.put("Li", "6.941"); eaw.put("Be", "9.012182");
        eaw.put("B", "10.811"); eaw.put("C", "12.0107");
        eaw.put("N", "14.00674"); eaw.put("O", "15.999");
        eaw.put("F", "18.9984032"); eaw.put("Ne", "20.1797");
        eaw.put("Na", "22.98976928"); eaw.put("Mg", "24.3050");
        eaw.put("Al", "26.9815386"); eaw.put("Si", "28.0855");
        eaw.put("P", "30.973762"); eaw.put("S", "32.065");
        eaw.put("Cl", "35.453"); eaw.put("Ar", "39.948");
        eaw.put("K", "39.0983"); eaw.put("Ca", "40.078");
        eaw.put("Sc", "44.955912"); eaw.put("Ti", "47.867");
        eaw.put("V", "50.9415"); eaw.put("Cr", "51.9961");
        eaw.put("Mn", "54.938045"); eaw.put("Fe", "55.845");
        eaw.put("Co", "58.933195"); eaw.put("Ni", "58.6934");
        eaw.put("Cu", "63.546"); eaw.put("Zn", "65.38");
        eaw.put("Ga", "69.723"); eaw.put("Ge", "72.63");
        eaw.put("As", "74.92160"); eaw.put("Se", "78.96");
        eaw.put("Br", "79.904"); eaw.put("Kr", "83.798");
        eaw.put("Rb", "85.4678"); eaw.put("Sr", "87.62");
        eaw.put("Y", "88.90585"); eaw.put("Zr", "91.224");
        eaw.put("Nb", "92.90638"); eaw.put("Mo", "95.94");
        eaw.put("Tc", "98.00"); eaw.put("Ru", "101.07");
        eaw.put("Rh", "102.90550"); eaw.put("Pd", "106.42");
        eaw.put("Ag", "107.8682"); eaw.put("Cd", "112.411");
        eaw.put("In", "114.818"); eaw.put("Sn", "118.710");
        eaw.put("Sb", "121.760"); eaw.put("Te", "127.60");
        eaw.put("I", "126.90447"); eaw.put("Xe", "131.293");
        eaw.put("Cs", "132.9054519"); eaw.put("Ba", "137.327");
        eaw.put("La", "138.90547"); eaw.put("Ce", "140.116");
        eaw.put("Pr", "140.90765"); eaw.put("Nd", "144.242");
        eaw.put("Pm", "145.00"); eaw.put("Sm", "150.36");
        eaw.put("Eu", "152.045"); eaw.put("Gd", "157.25");
        eaw.put("Tb", "158.92535"); eaw.put("Dy", "162.500");
        eaw.put("Ho", "164.93032"); eaw.put("Er", "167.259");
        eaw.put("Tm", "168.93421"); eaw.put("Yb", "173.04");
        eaw.put("Lu", "174.967"); eaw.put("Hf", "178.49");
        eaw.put("Ta", "180.94788"); eaw.put("W", "183.84");
        eaw.put("Re", "186.207"); eaw.put("Os", "190.23");
        eaw.put("Ir", "192.217"); eaw.put("Pt", "195.084");
        eaw.put("Au", "196.966569"); eaw.put("Hg", "200.59");
        eaw.put("Tl", "204.3833"); eaw.put("Pb", "207.2");
        eaw.put("Bi", "208.98040"); eaw.put("Po", "209.00");
        eaw.put("At", "210.00"); eaw.put("Rn", "222.00");
        eaw.put("Fr", "223.00"); eaw.put("Ra", "226.00");
        eaw.put("Ac", "227.00"); eaw.put("Th", "232.03806");
        eaw.put("Pa", "231.03588"); eaw.put("U", "238.02891");
        eaw.put("Np", "237.00"); eaw.put("Pu", "244.00");
        eaw.put("Am", "243.00"); eaw.put("Cm", "247.00");
        eaw.put("Bk", "247.00"); eaw.put("Cf", "251.00");
        eaw.put("Es", "252.00"); eaw.put("Fm", "257.00");
        eaw.put("Md", "258.00"); eaw.put("No", "259.00");
        eaw.put("Lr", "262.00"); eaw.put("Rf", "261.00");
        eaw.put("Db", "262.00"); eaw.put("Sg", "266.00");
        eaw.put("Bh", "264.00"); eaw.put("Hs", "277.00");
        eaw.put("Mt", "268.00"); eaw.put("Ds", "281.00");
        eaw.put("Rg", "280.00"); eaw.put("Cn", "285.00");
        eaw.put("Nh", "284.00"); eaw.put("Fl", "289.00");
        eaw.put("Mc", "288.00"); eaw.put("Lv", "293.00");
        eaw.put("Ts", "294.00"); eaw.put("Og", "294.00");
    }
}
