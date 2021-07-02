import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        final double g = 9.81;
        double v0 = 0;
        double t0 = 0;

        double v = v0;
        double h = h0;
        double a = g;
        double t = t0;
        double surface = 2.0;

        boolean soundFlag = false;
        boolean accelFlag = false;
        boolean parachuteFlag = false;

        while (h > 0) {
            System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, h, v, a);
            t++;

            double s = surface / masse;
            double q = Math.exp(-s * (t - t0));
            v = (g * (1 - q) / s) + (v0 * q);
            h = h0 - (g * (t - t0) / s) - ((v0 - (g / s)) * (1 - q) / s);
            a = g - (s * v);

            if (!soundFlag && (v > 343)) {
                soundFlag = true;
                System.out.println("## Felix depasse la vitesse du son");
            }
            if (!parachuteFlag && (h < 2500)) {
                parachuteFlag = true;
                surface = 25.0;
                v0 = v;
                t0 = t;
                h0 = h;
                System.out.println("## Felix ouvre son parachute");
            }
            if (!accelFlag && (a < 0.5)) {
                accelFlag = true;
                System.out.println("## Felix a atteint sa vitesse maximale");
            }
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
