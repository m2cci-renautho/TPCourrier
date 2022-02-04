public class Lettre extends Courrier {

    private FormatLettre format;

    static final double COEF_POIDS = 1.0;

    public Lettre(double poids, ModeEnvoi mode, String adresse_destination, FormatLettre format) {
        super(poids, mode, adresse_destination);
        this.format = format;
    }

    public double prix() {

        return this.format.tarifBase() + COEF_POIDS * (this.poids / 1000);
    }

    @Override
    public String toString() {

        return super.toString() +
                "\tFormat : " + this.format + "\n";
    }
}
