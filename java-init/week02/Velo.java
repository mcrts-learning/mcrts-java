import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int tarifA0 = 0;
        int tarifA1 = 7;
        int tarifB0 = 7;
        int tarifB1 = 17;
        int tarifC0 = 17;
        int tarifC1 = 24;


        if (!(debut >=0 && debut <= 24) || !(fin >=0 && fin <= 24)){
            System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        } else if (fin == debut) {
            System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        } else if (fin < debut) {
            System.out.println("Bizarre, le début de la location est après la fin ...");
        } else {
            int timeA = Math.max(0, Math.min(tarifA1, fin) - Math.max(tarifA0, debut));
            int timeB = Math.max(0, Math.min(tarifB1, fin) - Math.max(tarifB0, debut));
            int timeC = Math.max(0, Math.min(tarifC1, fin) - Math.max(tarifC0, debut));
            int total = 0;

            System.out.println("Vous avez loué votre vélo pendant");
            if (timeA + timeC > 0) {
                total += timeA + timeC * 1;
                System.out.print(timeA + timeC);
                System.out.print(" heure(s) au tarif horaire de " + 1.0);
                System.out.println(" franc(s)");
            }
            if (timeB > 0) {
                total += timeB * 2;
                System.out.print(timeB);
                System.out.print(" heure(s) au tarif horaire de " + 2.0);
                System.out.println(" franc(s)");
            }
            System.out.print("Le montant total à payer est de " + (double)total);
            System.out.println(" franc(s).");
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
