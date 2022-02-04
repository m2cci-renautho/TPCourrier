public abstract class Courrier {

    protected double poids;
    protected ModeEnvoi mode;
    protected String adresse_destination;

    public Courrier(double poids, ModeEnvoi mode, String adresse_destination) {
        this.poids = poids;
        this.mode = mode;
        this.adresse_destination = adresse_destination;
    }

    public double getPoids() {
        return this.poids;
    }

    public ModeEnvoi getMode() {
        return this.mode;
    }

    public String getAdresseDestionation() {
        return this.adresse_destination;
    }

    public boolean estValide() {
        return !(this.adresse_destination == "");
    }

    public double affranchir() {
        return (this.estValide()) ? this.mode.coefficient() * this.prix() : 0;
    }

    @Override
    public String toString() {

        String valide = "";
        String express = "non";
        String prix = "";
        if (!this.estValide())
            valide = "(Courrier invalide)\n";
        else {
            prix = "\tPrix : " + this.affranchir() + " €\n";
        }
        if (this.mode == ModeEnvoi.EXPRESS)
            express = "oui";

        return this.getClass().getName() + "\n" +
                valide +
                "\tPoids : " + this.poids + " grammes\n" +
                "\tExpress : " + express + "\n" +
                "\tDestination : " + this.adresse_destination + "\n" +
                prix;
    }

    abstract double prix();
}
