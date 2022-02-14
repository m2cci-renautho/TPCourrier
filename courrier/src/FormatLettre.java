/**
 * Enumération permettant d'associer le format d'une lettre et son prix.
 */
public enum FormatLettre {
    A3(3.5),
    A4(2.5);

    private final double tarifBase;

    FormatLettre(double tarifBase) {

        this.tarifBase = tarifBase;
    }

    public double tarifBase() {
        return this.tarifBase;
    }
}