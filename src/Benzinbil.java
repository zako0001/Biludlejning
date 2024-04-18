public class Benzinbil extends Bil {

    // Attributes
    private int oktantal;
    private double kilometerPerLiter;

    public Benzinbil(int registreringsnummer, String mærke, String model, int årgang, int antalDøre, int oktantal, double kilometerPerLiter) {
        super(registreringsnummer, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kilometerPerLiter = kilometerPerLiter;
    }

    // Getters
    public int getOktantal() {
        return oktantal;
    }
    public double getKilometerPerLiter() {
        return kilometerPerLiter;
    }

    // Setters
    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }
    public void setKilometerPerLiter(double kilometerPerLiter) {
        this.kilometerPerLiter = kilometerPerLiter;
    }

    // Bil method
    @Override
    public double beregnGrønEjerafgift() {

        return beregnGE(kilometerPerLiter, false);
    }

    // Object method
    @Override
    public String toString() {

        return STR."""
            \{toStr()}
            Oktantal: \{oktantal}
            KilometerPerLiter: \{kilometerPerLiter}
            """;
    }
}