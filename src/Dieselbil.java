public class Dieselbil extends Bil {

    // Attributes
    private boolean harPartikelfilter;
    private double kilometerPerLiter;

    public Dieselbil(int registreringsnummer, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, double kilometerPerLiter) {
        super(registreringsnummer, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kilometerPerLiter = kilometerPerLiter;
    }

    // Getters
    public boolean getHarPartikelfilter() {
        return harPartikelfilter;
    }
    public double getKilometerPerLiter() {
        return kilometerPerLiter;
    }

    // Setters
    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }
    public void setKilometerPerLiter(double kilometerPerLiter) {
        this.kilometerPerLiter = kilometerPerLiter;
    }

    @Override
    public double beregnGrønEjerafgift() {

        return beregnGE(kilometerPerLiter, true) + (harPartikelfilter ? 0 : 1000);
    }

    // Object method
    @Override
    public String toString() {

        return STR."""
            \{toStr()}
            Har partikelfilter: \{harPartikelfilter ? "Ja" : "Nej"}
            KilometerPerLiter: \{kilometerPerLiter}
            """;
    }
}