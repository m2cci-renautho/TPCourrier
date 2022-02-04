
public class App {
    public static void main(String[] args) throws Exception {

        Machine machine = new Machine(10);

        Lettre l1 = new Lettre(200, ModeEnvoi.EXPRESS, "Chemin des Accacias 28, 1009 Pully", FormatLettre.A3);
        machine.deposerCourrier(l1);
        Lettre l2 = new Lettre(800, ModeEnvoi.NORMAL, "", FormatLettre.A4);
        machine.deposerCourrier(l2);
        Publicite p1 = new Publicite(1500, ModeEnvoi.EXPRESS, "Les Moilles  13A, 1913 Saillon");
        machine.deposerCourrier(p1);
        Publicite p2 = new Publicite(3000, ModeEnvoi.NORMAL, "");
        machine.deposerCourrier(p2);
        Colis c1 = new Colis(5000, ModeEnvoi.EXPRESS, "Grand rue 18, 1950 Sion", 30);
        machine.deposerCourrier(c1);
        Colis c2 = new Colis(8000, ModeEnvoi.EXPRESS, "Chemin des fleurs 48, 2800 Delemont", 70);
        machine.deposerCourrier(c2);

        machine.affranchir();
        machine.afficher();
        machine.courriersInvalides();
    }
}
