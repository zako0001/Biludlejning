public class Elbil extends Bil {

    // Attibutes
    private double batterikapacitetKilowattTimer;
    private double maksimalRækkeviddeKilometer;
    private double wattTimerPerKilometer;

    public Elbil(int registreringsnummer, String mærke, String model, int årgang, int antalDøre, int batterikapacitetKilowattTimer, int maxKilometer, int wattTimerPerKilometer) {
        super(registreringsnummer, mærke, model, årgang, antalDøre);
        this.batterikapacitetKilowattTimer = batterikapacitetKilowattTimer;
        this.maksimalRækkeviddeKilometer = maxKilometer;
        this.wattTimerPerKilometer = wattTimerPerKilometer;
    }

    // Getters
    public double getBatterikapacitetKilowattTimer() {
        return batterikapacitetKilowattTimer;
    }
    public double getMaksimalRækkeviddeKilometer() {
        return maksimalRækkeviddeKilometer;
    }
    public double getWattTimerPerKilometer() {
        return wattTimerPerKilometer;
    }

    // Setters
    public void setBatterikapacitetKilowattTimer(int batterikapacitetKilowattTimer) {
        this.batterikapacitetKilowattTimer = batterikapacitetKilowattTimer;
    }
    public void setMaksimalRækkeviddeKilometer(int maksimalRækkeviddeKilometer) {
        this.maksimalRækkeviddeKilometer = maksimalRækkeviddeKilometer;
    }
    public void setWattTimerPerKilometer(int wattTimerPerKilometer) {
        this.wattTimerPerKilometer = wattTimerPerKilometer;
    }

    // Bil method
    @Override
    public double beregnGrønEjerafgift() {

        double kilometerPerLiter = 100 / wattTimerPerKilometer / 91.25;

        return beregnGE(kilometerPerLiter, false);
    }

    // Object method
    @Override
    public String toString() {

        return STR."""
            \{toStr()}
            Batterikapacitet i kWt: \{batterikapacitetKilowattTimer}
            Maksimal rækkevidde i km: \{maksimalRækkeviddeKilometer}
            Wt pr. km: \{wattTimerPerKilometer}
            """;
    }
}