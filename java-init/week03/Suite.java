import java.util.Scanner;

class Suite {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int debut;
        do {
            System.out.print("de (>= 1) ? ");
            debut = clavier.nextInt();
        } while (debut < 1);

        int fin;
        do {
            System.out.print("a (>= " + debut + ") ? ");
            fin = clavier.nextInt();
        } while (fin < debut);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        for (int i = debut; i <= fin; i++) {
            int k = 0;
            int value = i;

            do {
                k++;
                if (value % 3 == 0) {
                    value += 4;
                } else if (value % 4 == 0) {
                    value /= 2;
                } else {
                    value--;
                }
            } while (value > 0);
            System.out.print(i);
            System.out.println(" -> " + k);
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
