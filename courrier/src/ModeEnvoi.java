/**
 * Enumeration permettant d'associer un mode d'envoi à un prix. 
 */
public enum ModeEnvoi {

    /**
     * Correspond au mode d'envoi normal
     */
    NORMAL(1.0),
    /**
     * Correspond au mode d'envoi express. 
     */
    EXPRESS(2.0);

    /**
     * Le coefficient à appliquer en fonction du mode.
     */
    private final double coefficient;

    /**
     * Constructeur
     * @param coefficient à appliquer
     */
    ModeEnvoi(double coefficient) {

        this.coefficient = coefficient;
    }
    /**
     * 
     * @return le coefficient.
     */
    public double coefficient() {
        return this.coefficient;
    }
}
