public class Colis extends Courrier {

    private double volume;
    static final double COEF_POIDS = 1.0;
    static final double COEF_VOLUME = 0.25;
    static final double VOLUME_MAX = 50;

    public Colis(double poids, ModeEnvoi mode, String adresse_destination, double volume) {
        super(poids, mode, adresse_destination);
        this.volume = volume;
    }

    public double prix() {

        return COEF_VOLUME * this.volume + COEF_POIDS * (this.poids / 1000);
    }

    @Override
    public boolean estValide() {

        return super.estValide() && (this.volume <= VOLUME_MAX);
    }

    @Override
    public String toString() {

        return super.toString() +
                "\tVolume : " + this.volume + " litres \n";
    }
}
