package Algoritmusok;

public class TobbDimenziosTomb {

        public static void main(String[] args) {
            negyzetes();
            fureszes();
            haromDim();
        }

        private static void negyzetes() {
            int[][] negyzetes = new int[3][5];
            tombKiir("NÉGYZETES\neredeti, csupa 0:", negyzetes);
            negyzetes[1][2] = 1;
            tombKiir("\nközépen 1:", negyzetes);
        }

        private static void fureszes() {
            final int MAX_SOR_DB = 7;
            final int MIN_OSZL_DB = 3;
            int[][] fureszes = new int[MAX_SOR_DB][];
            for (int i = 0; i < fureszes.length; i++) {
                fureszes[i] = new int[MIN_OSZL_DB + (int)(Math.random()*5)];
            }

            tombKiir("FŰRÉSZES\neredeti, csupa 0:", fureszes);
            int velSor = (int)(Math.random()*MAX_SOR_DB);
            int velOszlop = (int)(Math.random()*MIN_OSZL_DB);
            fureszes[velSor][velOszlop] = 1;
            tombKiir("valahol 1:", fureszes);
        }

        private static void tombKiir(String cim, int[][] matrix) {
            System.out.println(cim);
            int sorDb = matrix.length;

            /* a fűrészesnbek minden sora más hosszú lehet */
            //int oszlopDb = matrix[0].length;
            for (int sor = 0; sor < sorDb; sor++) {
                for (int oszlop = 0; oszlop <  matrix[sor].length; oszlop++) {
                    //for (int oszlop = 0; oszlop < oszlopDb; oszlop++) {
                    System.out.print(matrix[sor][oszlop] + " ");
                }
                System.out.println("");
            }

            /* ez jó négyzetesre és fűrészesre is: */
//        for (int[] tomb : matrix) {
//            for (int szam : tomb) {
//                System.out.print(szam + " ");
//            }
//            System.out.println("");
//        }
        }

        private static void haromDim() {
            int[][][] hd = new int[4][7][3];
        }



}
