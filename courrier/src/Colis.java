/**
 * Classe héritée de Courrier gérant l'affranchissement d'un colis.
 */
public class Colis extends Courrier {

    /**
     * Variables de classe : les différents coefficients associés au type Colis. 
     */
    static final double COEF_POIDS = 1.0;
    static final double COEF_VOLUME = 0.25;
    static final double VOLUME_MAX = 50;
    /**
     * Variables d'instance : le volume du colis.
     */
    private double volume;
    /**
     * Constructeur de l'objet Colis.
     * @param poids Poids du colis en grammes
     * @param mode Le mode d'envoi (normal ou express)
     * @param adresse_destination L'adresse de destination du colis. 
     * @param volume Le volume en litres. 
     */
    public Colis(double poids, ModeEnvoi mode, String adresse_destination, double volume) {
        super(poids, mode, adresse_destination);
        this.volume = volume;
    }
    /**
     * Calcul du prix du colis. 
     */
    public double prix() {

        return COEF_VOLUME * this.volume + COEF_POIDS * (this.poids / 1000);
    }
    /**
     * Renvoie vrai si et seulement si le colis est valide, c'est à dire si son volume n'excède pas le volume maximum.
     */
    @Override
    public boolean estValide() {

        return super.estValide() && (this.volume <= VOLUME_MAX);
    }
    /**
     * Ajoute le volume à la méthode toString de la classe abstraite courrier. 
     */
    @Override
    public String toString() {

        return super.toString() +
                "\tVolume : " + this.volume + " litres \n";
    }
}
