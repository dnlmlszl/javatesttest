package Algoritmusok;

public class FoAtlo {

        static int[][] matrix;

        public static void main(String[] args) {
            foatloOsszegFeladat();
        }

        private static void foatloOsszegFeladat() {
            feltoltesFixErtekekkel();
            matrixKiir();
            osszegKiir();

            feltoltesVelErtekekkel();
            matrixKiir();
            osszegKiir();
        }

        private static void feltoltesFixErtekekkel() {
            matrix = new int[3][3];
            matrix[0][0] = 4;
            matrix[0][1] = 2;
            matrix[0][2] = 6;

            matrix[1][0] = 3;
            matrix[1][1] = 7;
            matrix[1][2] = 2;

            matrix[2][0] = 1;
            matrix[2][1] = 8;
            matrix[2][2] = 9;
        }

        private static void feltoltesVelErtekekkel() {
            final int M = 5;
            matrix = new int[M][M];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < M; j++) {
                    matrix[i][j] = (int)(Math.random()*15);
                }
            }
        }

        private static void matrixKiir() {
            System.out.println("Mátrix elemei: ");
            for (int[] tomb : matrix) {
                for (int szam : tomb) {
                    System.out.printf("%3d",szam);
                }
                System.out.println("");
            }
        }

        private static int foatloOsszegSzamitas(int[][] matrix) {
            /* összegzés tétele: */
            int osszeg = 0;
            for (int i = 0; i < matrix.length; i++) {
                osszeg += matrix[i][i];
            }

            return osszeg;
        }

        private static void osszegKiir() {
            int osszeg = foatloOsszegSzamitas(matrix);
            System.out.println("főátló összege: " + osszeg);
        }


}
