/**
 * Enumération permettant d'associer le format d'une lettre et son prix.
 */
public enum FormatLettre {
    /**
     * Format de lettre A3
     */
    A3(3.5),
    /**
     * Format de lettre A4
     */
    A4(2.5);

    /**
     * Le tarif de base à fixer.
     */
    private final double tarifBase;

    /**
     * Fixe le tarif de base
     * @param tarifBase Le tarif de base à fixer
     */
    FormatLettre(double tarifBase) {

        this.tarifBase = tarifBase;
    }
    /**
     * 
     * @return le tarif de base de l'objet.
     */
    public double tarifBase() {
        return this.tarifBase;
    }
}