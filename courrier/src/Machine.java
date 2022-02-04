import java.util.ArrayList;

public class Machine {

    private int capacite;
    private ArrayList<Courrier> courriers;

    public Machine(int capacite) {
        this.capacite = capacite;
        this.courriers = new ArrayList<Courrier>();
    }

    public void deposerCourrier(Courrier C) {

        if (this.courriers.size() >= this.capacite)
            throw new IllegalArgumentException("Capacité dépassée");

        this.courriers.add(C);
    }

    public double affranchir() {
        double montant = 0;
        for (Courrier C : this.courriers) {
            montant += C.affranchir();
        }
        System.out.printf("Le montant total d'affranchissement est de : %.2f €\n", montant);

        return montant;
    }

    public int courriersInvalides() {

        int nbInvalides = 0;
        for (Courrier C : this.courriers) {
            nbInvalides += (!C.estValide()) ? 1 : 0;
        }
        System.out.printf("La boîte contient %d courriers invalides\n", nbInvalides);
        return nbInvalides;
    }

    public void afficher() {

        for (Courrier C : this.courriers) {
            System.out.println(C);

        }
    }

}
