import java.util.Scanner;

public class Champi {
    static final String CHAMP_1 = "l'agaric jaunissant.";
    static final String CHAMP_2 = "l'amanite tue-mouches.";
    static final String CHAMP_3 = "le cèpe de Bordeaux.";
    static final String CHAMP_4 = "le coprin chevelu.";
    static final String CHAMP_5 = "la girolle.";
    static final String CHAMP_6 = "le pied bleu.";
    static final String QUESTION_1 = "Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ";
    static final String QUESTION_2 = "Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ";
    static final String QUESTION_3 = "Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ";
    static final String QUESTION_4 = "Est-ce que votre champignon a un anneau (true : oui, false : non) ? ";

    public static void main(String[] args) {
        System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
        System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");

        String champignon;
        boolean q = false;
        Scanner clavier = new Scanner(System.in);

        System.out.print(QUESTION_3);
        q = clavier.nextBoolean();

        if (q) {
            System.out.print(QUESTION_2);
            q = clavier.nextBoolean();
            if (q) {
                System.out.print(QUESTION_4);
                q = clavier.nextBoolean();
                if (q) {
                    champignon = CHAMP_2;
                } else {
                    champignon = CHAMP_6;
                }
            } else {
                champignon = CHAMP_1;
            }
        } else {
            System.out.print(QUESTION_4);
            q = clavier.nextBoolean();
            if (q) {
                champignon = CHAMP_4;
            } else {
                System.out.print(QUESTION_1);
                q = clavier.nextBoolean();
                if (q) {
                    champignon = CHAMP_5;
                } else {
                    champignon = CHAMP_3;
                }
            }
        }
        System.out.print("==> Le champignon auquel vous pensez est " + champignon);
    }
}