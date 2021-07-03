import java.util.ArrayList;
import java.util.Scanner;

class TrancheMax {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        // Entree de la matrice
        System.out.println("Saisie de la matrice :");
        String matrice = clavier.nextLine();
        System.out.format("Matrice saisie :\n%s\n", matrice);
        clavier.close();

        // Validation de la matrice
        if (!checkFormat(matrice)) {
            return;
        }

        // Trouver la liste des lignes avec le plus grand nombre de 1 consecutif
        // Ces numéros de lignes sont stockés dans un tableau dynamique
        ArrayList<Integer> maxConsecutifList = findConsecutiveList(matrice);

        if (maxConsecutifList.isEmpty()) {
            System.out.println("Pas de lignes avec des 1 !");
        } else {
            System.out.println("Ligne(s) avec le plus de 1 consecutifs :");
            for (Integer index : maxConsecutifList) {
                System.out.println(index);
            }
        }
    }

    /*******************************************
     * Completez le programme a partir d'ici.
     *******************************************/
    public static boolean checkFormat(String matrice) {
        String matrice0 = matrice.trim().replaceAll(" +", " ");
        if (matrice0.length() == 0) {
            System.out.println("Matrice vide !");
            return false;
        }

        for (int i = 0; i < matrice0.length(); i++) {
            if (! (matrice0.charAt(i) == '0' || matrice0.charAt(i) == '1' || matrice0.charAt(i) == ' ')) {
                System.out.println("Matrice invalide : seuls '1', '0' et ' ' sont admis !");
                return false;
            }
        }
        return checkLineLength(matrice0);
    }

    public static boolean checkLineLength(String matrice) {
        String matrice0 = matrice.trim().replaceAll(" +", " ");
        String[] lignes = matrice0.split(" {1,}");
        int size = lignes[0].length();
        for (String l : lignes) {
            if (l.length() != size) {
                System.out.println("Matrice invalide, lignes de longueurs differentes !");
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> findConsecutiveList(String matrice) {
        String matrice0 = matrice.trim().replaceAll(" +", " ");
        ArrayList<Integer> result = new ArrayList<Integer>();
        String[] lignes = matrice0.split(" {1,}");

        int n = 1;
        for (int i = 0; i < lignes.length; i++) {
            if (findConsecutive(lignes[i]) == n) {
                result.add(i);
            } else if (findConsecutive(lignes[i]) > n) {
                n = findConsecutive(lignes[i]);
                result.clear();
                result.add(i);
            }
        }
        return result;
    }

    public static int findConsecutive(String line) {
        int countMax = 0;
        int count = 0;
        for (char ch : line.toCharArray()) {
            if (ch == '1') {
                count++;
            } else {
                count = 0;
            }
            if (count > countMax) {
                countMax = count;
            }
        }
        return countMax;
    }
    /*******************************************
     * Ne rien modifier apres cette ligne
     *******************************************/
}
