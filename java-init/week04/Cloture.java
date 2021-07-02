import java.util.ArrayList;

class Cloture {
    public static void main(String[] args) {
        int[][] carte = {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };

        /*******************************************
         * Completez le programme à partir d'ici.
         *******************************************/
        final int lengthI = carte.length;
        final int lmaxI = carte.length - 1;
        final int lengthJ = carte[0].length;
        final int lmaxJ = carte[0].length - 1;


        // Check for non binary values
        for (int i = 0; i < lengthI; i++) {
            for(int j = 0; j < lengthJ; j++) {
                if (carte[i][j] != 0 && carte[i][j] != 1) {
                    System.out.println("Votre carte du terrain n'a pas le bon format :");
                    System.out.print("valeur '" + carte[i][j]);
                    System.out.print("' trouvée en position [" + i);
                    System.out.print("][" + j);
                    System.out.println("]");
                    return;
                }
            }
        }

        // Mark outside patch
        int rank = 1;
        for (int i = 0; i < lengthI; i++) {
            for (int j = 0; j < lengthJ; j++) {
                if (carte[i][j] == 0) {
                    rank += 1;
                    java.util.Vector<int[]> positions = new java.util.Vector<int[]>();
                    int[] position = {i, j};
                    positions.add(position);
                    while (!positions.isEmpty()) {
                        int[] pos = positions.remove(0);
                        int x = pos[0];
                        int y = pos[1];
                        if (carte[x][y] == 0) {
                            carte[x][y] = rank;
                            if (x > 0) {
                                int[] newpos = {x-1, y};
                                positions.add(newpos);
                            }
                            if (y > 0) {
                                int[] newpos = {x, y-1};
                                positions.add(newpos);
                            }
                            if (x < lmaxI) {
                                int[] newpos = {x+1, y};
                                positions.add(newpos);
                            }
                            if (y < lmaxJ) {
                                int[] newpos = {x, y+1};
                                positions.add(newpos);
                            }
                        }
                    }
                }
            }
        }

        // Convert inner patch
        java.util.HashSet<Integer> outsideComposantes = new java.util.HashSet<Integer>();
        for (int i = 0; i < lengthI; i++) {
            for (int j = 0; j < lengthJ; j++) {
                if ((i == 0 || i == lmaxI || j == 0 || j == lmaxJ) && carte[i][j] > 1) {
                    outsideComposantes.add(carte[i][j]);
                }
            }
        }
        for (int i = 0; i < lengthI; i++) {
            for (int j = 0; j < lengthJ; j++) {
                if (carte[i][j] != 1 && !outsideComposantes.contains(carte[i][j])) {
                    carte[i][j] = 1;
                }
            }
        }

        // Check for convexity
        for (int i = 0; i < lengthI; i++) {
            int left = lmaxJ;
            int right = 0;
            for (int j = 0; j < lengthJ; j++) {
                if (carte[i][j] == 1 && j <= left) {
                    left = j;
                }
                if (carte[i][j] == 1 && j >= right) {
                    right = j;
                }
            }

            for (int j = left + 1; j < right; j++) {
                if (carte[i][j] != 1) {
                    System.out.println("Votre carte du terrain n'a pas le bon format :");
                    System.out.print("bord extérieur entrant trouvé en position [" + i);
                    System.out.print("][" + j);
                    System.out.println("]");
                    return;
                }
            }
        }

        // Compute fences length
        int unit = 2 * lengthI;
        for (int j = 0; j < lengthJ; j++) {
            if (carte[0][j] == 1) {
                unit += 1;
            }
            if (carte[lmaxI][j] == 1) {
                unit += 1;
            }
        }
        for (int i = 0; i < lengthI; i++) {
            for (int j = 0; j < lengthJ; j++) {
                
                if (carte[i][j] != 1 && i > 0 && carte[i-1][j] == 1) {
                    unit += 1;
                }
                if (carte[i][j] != 1 && i < lmaxI && carte[i+1][j] == 1) {
                    unit += 1;
                }
                
            }
        }
        double fenceLength = unit * 2.5;
        System.out.print("Il vous faut " + fenceLength);
        System.out.println(" mètres de clôture pour votre terrain.");

        /*
        for (int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                System.out.print(carte[i][j]);
            }
            System.out.println();
        }
        */
        /*******************************************
         * Ne rien modifier après cette ligne.
         *******************************************/
    }
}
