
/**
 * Définition du type abstrait Courrier
 */
public abstract class Courrier {

    /**
     * Le poids du courrier
     */
    protected double poids;
    /**
     * Le mode d'expédition
     */
    protected ModeEnvoi mode;
    /**
     * L'adresse de destination
     */
    protected String adresse_destination;

    /**
     * Construit un objet abstrait courrier
     * 
     * @param poids               Le poids de courrier
     * @param mode                Son mode d'expédition
     * @param adresse_destination Son adresse de destination.
     */
    public Courrier(double poids, ModeEnvoi mode, String adresse_destination) {
        this.poids = poids;
        this.mode = mode;
        this.adresse_destination = adresse_destination;
    }

    /**
     * 
     * @return Le poids du courrier.
     */
    public double getPoids() {
        return this.poids;
    }

    /**
     * 
     * @return Le mode d'expédition.
     */
    public ModeEnvoi getMode() {
        return this.mode;
    }

    /**
     * 
     * @return L'adresse de destination du courrier.
     */
    public String getAdresseDestionation() {
        return this.adresse_destination;
    }

    /**
     * 
     * @return True si et seulement si le courrier est valide (ie l'adresse de
     *         destination est non vide)
     */
    public boolean estValide() {
        return !(this.adresse_destination == "");
    }

    /**
     * 
     * @return La partie invariable de l'affranchissement d'un courrier.
     */
    public double affranchir() {
        return (this.estValide()) ? this.mode.coefficient() * this.prix() : 0;
    }

    @Override
    /**
     * Renvoie une chaîne de caractère comportant le nom et la valeur de tous les
     * attributs globaux du courrier.
     */
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

    /**
     * Méthode abstraite laissée aux classes filles pour calculer le prix
     * spécifique.
     * 
     * @return Prix spécifique du courrier.
     */
    abstract double prix();
}
