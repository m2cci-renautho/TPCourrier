/**
 *  Classe héritée de Courrier gérant l'affranchissement d'une lettre
 */

public class Lettre extends Courrier {

    /**
     * Variable d'instance : le format de la lettre
     */
    private FormatLettre format;
    /**
     * Variable de classe : Coefficient à appliquer dans le calcul du prix. 
     */
    static final double COEF_POIDS = 1.0;
    /**
     * Constructeur de l'objet Lettre.
     * @param poids Poids de la lettre (en grammes)
     * @param mode Mode d'envoi (express, normal)
     * @param adresse_destination Adresse de destination
     * @param format Format de la lettre (A4, A3)
     */
    public Lettre(double poids, ModeEnvoi mode, String adresse_destination, FormatLettre format) {
        super(poids, mode, adresse_destination);
        this.format = format;
    }
    /**
     * Calcul du prix d'affranchissement d'une lettre. 
     */
    public double prix() {

        return this.format.tarifBase() + COEF_POIDS * (this.poids / 1000);
    }
    /**
     * Ajoute le format à la méthode toString de la classe abstraite courrier. 
     */
    @Override
    public String toString() {

        return super.toString() +
                "\tFormat : " + this.format + "\n";
    }
}
