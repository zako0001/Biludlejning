import static java.lang.StringTemplate.STR;

public abstract class Bil {

    // Attributes
    private int registreringsnummer;
    private String mærke;
    private String model;
    private int årgang;
    private int antalDøre;

    // Constructor
    public Bil(int registreringsnummer, String mærke, String model, int årgang, int antalDøre) {
        this.registreringsnummer = registreringsnummer;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
    }

    // Getters
    public int getRegistreringsnummer() {
        return registreringsnummer;
    }
    public String getMærke() {
        return mærke;
    }
    public String getModel() {
        return model;
    }
    public int getÅrgang() {
        return årgang;
    }
    public int getAntalDøre() {
        return antalDøre;
    }

    // Setters
    public void setRegistreringsnummer(int registreringsnummer) {
        this.registreringsnummer = registreringsnummer;
    }
    public void setMærke(String mærke) {
        this.mærke = mærke;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }
    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    // Method
    public abstract double beregnGrønEjerafgift();

    // Auxiliary methods for subclasses
    protected int beregnGE(double kilometerPerLiter, boolean dieselbil) {

        if (kilometerPerLiter > 20) {
            return 330 + (dieselbil ? 130 : 0);
        } else if (kilometerPerLiter > 15) {
            return 1050 + (dieselbil ? 1390 : 0);
        } else if (kilometerPerLiter > 10) {
            return 2340 + (dieselbil ? 1850 : 0);
        } else if (kilometerPerLiter > 5) {
            return 5500 + (dieselbil ? 2770 : 0);
        } else {
            return 10470 + (dieselbil ? 15260 : 0);
        }
    }

    protected String toStr() {

        return STR."""

            Registreringsnummer: \{registreringsnummer}
            Mærke: \{mærke}
            Model: \{model}
            Årgang: \{årgang}
            Antal døre: \{antalDøre}""";
    }
}