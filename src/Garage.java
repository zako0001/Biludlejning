import java.util.ArrayList;
import java.util.stream.Collectors;

public class Garage {

    // Attribute
    private final ArrayList<Bil> bilpark;

    // Property
    public final String navn;

    // Constructor
    public Garage(String navn) {
        this.navn = navn;
        bilpark = new ArrayList<>();
    }

    // Methods
    public void tilføjBil(Bil bil) {
        bilpark.add(bil);
    }

    public double beregnGrønEjerafgift() {

        return bilpark.stream()
                .mapToDouble(Bil::beregnGrønEjerafgift)
                .sum();
    }

    // Object method
    @Override
    public String toString() {

        return bilpark.stream()
                .map(Bil::toString)
                .collect(Collectors.joining());
    }
}