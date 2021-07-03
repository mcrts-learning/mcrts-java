import java.util.Scanner;

public class Paques {
    private final static Scanner CLAVIER = new Scanner(System.in);

    public static int demanderAnnee() {
        int a = 0;
        do {
            System.out.println("Entrez une annee (1583-4000) :");
            a = CLAVIER.nextInt();
        } while (a < 1583 || a > 4000);
        return a;
    }
    
    public static void afficheDate(int year, int day) {
        System.out.print("Date de Paques en " + year + " : ");
        if (day <= 31) {
            System.out.print(day);
            System.out.println(" mars");
        } else {
            System.out.print(day - 31);
            System.out.println(" avril");
        }
    }

    public static int datePaques(int year) {
        int siecle = year / 100;
        int p = ((13 + (8 * siecle)) / 25);
        int q = (siecle / 4);
        int m = ((15 - p + siecle - q) % 30);
        int n = ((4 + siecle - q) % 7);
        int d = ((m + (19 * (year % 19))) % 30);
        int e = ((2 * (year % 4) + 4 * (year % 7) + 6 * d + n) % 7);

        int jour = (e + d + 22);
        if (e == 6 && (d == 29 || (d == 28 && ((11 * (m + 1)) % 30 < 19 )))) {
            jour -= 7;
        }
        return jour;
    }

    public static void main(String[] args) {
        int year = demanderAnnee();
        afficheDate(year, datePaques(year));
    }
}
