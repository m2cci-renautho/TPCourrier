/**
 *  Classe héritée de Courrier gérant l'affranchissement d'une publicité
 */

public class Publicite extends Courrier {
    
    static final double COEF_POIDS = 5.0;

    public Publicite(double poids, ModeEnvoi mode, String adresse_destination) {
        super(poids, mode, adresse_destination);
    }

    public double prix() {

        return COEF_POIDS * (this.poids / 1000);
    }
}
