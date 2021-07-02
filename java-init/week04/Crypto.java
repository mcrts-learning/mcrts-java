import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        String[] arr = s.split("");
        for (String ch: arr) {
            if (ch.equals(" ") || ALPHABET.contains(ch)) {
                aCoder += ch;
            }
        }

        char[] chars = aCoder.toCharArray();
        for (char ch: chars) {
            if (ch == ' ') {
                chaineCodee += ch;
            } else {
                int idx = (((int) ch) - 97 + DECALAGE) % 26;
                chaineCodee += (char) (idx + 97);
            }
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}
