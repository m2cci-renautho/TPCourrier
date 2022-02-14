/**
 *  Classe héritée de Courrier gérant l'affranchissement d'une publicité
 */

public class Publicite extends Courrier {

    /**
     * Variable de classe : coefficient à appliquer en fonction du poids.
     */
    static final double COEF_POIDS = 5.0;

    /**
     * Construit un objet de type publicité
     * @param poids Le poids de la publicité
     * @param mode Le mode d'envoi
     * @param adresse_destination L'adresse de destination.
     */
    public Publicite(double poids, ModeEnvoi mode, String adresse_destination) {
        super(poids, mode, adresse_destination);
    }
    /**
     * Calcul effectif du prix de la publicité. 
     */
    public double prix() {

        return COEF_POIDS * (this.poids / 1000);
    }
}
