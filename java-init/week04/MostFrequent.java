
class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        java.util.Map<Integer, Integer> counter = new java.util.HashMap<Integer, Integer>();
        java.util.Map<Integer, Integer> position = new java.util.HashMap<Integer, Integer>();

        for (int i = 0; i < taille; i++) {
            counter.put(tab1[i], counter.getOrDefault(tab1[i], 0) + 1);
            position.putIfAbsent(tab1[i], i);
        }
        
        int argmax = 0;
        int valmax = 0;

        for (java.util.Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            if (v > valmax) {
                argmax = k;
                valmax = v;
            } else if (v == valmax && position.getOrDefault(k, 0) < position.getOrDefault(argmax, 0)) {
                argmax = k;
                valmax = v;
            }
        }
        System.out.println("Le nombre le plus frequent dans le tableau est le : ");
        System.out.println(argmax + " (" + valmax + " x)");
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
