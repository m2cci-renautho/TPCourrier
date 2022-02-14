import java.util.ArrayList;


/**
 * Classe modélisant la machine à affranchir le courrier.
 */
public class Machine {  
    /**
     * Variables d'instance : la capacité et la liste des courriers à affranchir.
     */
    private int capacite;
    private ArrayList<Courrier> courriers;

    /**
     * Constructeur de l'objet Machine
     * @param capacite Capacité de la machine.
     */
    public Machine(int capacite) {
        this.capacite = capacite;
        this.courriers = new ArrayList<Courrier>();
    }
    /**
     * Permet d'ajouter un courrier à la machine
     * @param C Le courrier à ajouter à la machine
     */
    public void deposerCourrier(Courrier C) {

        if (this.courriers.size() >= this.capacite)
            throw new IllegalArgumentException("Capacité dépassée");

        this.courriers.add(C);
    }
    /**
     * Calcule le montant total de l'affranchissement
     * @return montant total d'affranchissement
     */
    public double affranchir() {
        double montant = 0;
        for (Courrier C : this.courriers) {
            montant += C.affranchir();
        }
        System.out.printf("Le montant total d'affranchissement est de : %.2f €\n", montant);

        return montant;
    }
    /**
     * Compte le nombre de courriers invalides
     * @return nombre de courriers invalides.
     */
    public int courriersInvalides() {

        int nbInvalides = 0;
        for (Courrier C : this.courriers) {
            nbInvalides += (!C.estValide()) ? 1 : 0;
        }
        System.out.printf("La boîte contient %d courriers invalides\n", nbInvalides);
        return nbInvalides;
    }
    /**
     * Affiche l'ensemble des courriers de la machine. 
     */
    public void afficher() {

        for (Courrier C : this.courriers) {
            System.out.println(C);

        }
    }

}
