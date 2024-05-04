package Algoritmusok;

public class MatrixokOsszeadas {

        public static void main(String[] args) {
            matrixokOsszeadasa();
        }

        private static void matrixokOsszeadasa() {
            int[][] matrixA = feltolt(3,2);
            int[][] matrixB = feltolt(3,2);
            matrixKiir("\'A\' mátrix:", matrixA);
            matrixKiir("\'B\' mátrix:", matrixB);
            int[][] matrixC = matrixOsszeg(matrixA, matrixB);
            matrixKiir("\'A\' és \'B\' mátrix összege:", matrixC);
        }


        private static int[][] feltolt(int sor, int oszlop) {
            int[][] matrix = new int[sor][oszlop];
            int also = -15, felso = 25;
            int db = felso - also + 1;
            for (int i = 0; i < sor; i++) {
                for (int j = 0; j < oszlop; j++) {
                    int szam = (int)(Math.random()*db) + also;
                    matrix[i][j] = szam;
                }
            }

            return matrix;
        }

        private static void matrixKiir(String cim, int[][] matrix) {
            System.out.println(cim);
            int sor = matrix.length;
            for (int i = 0; i < sor; i++) {
                int oszl = matrix[i].length;
                for (int j = 0; j < oszl; j++) {
                    System.out.printf("%4d", matrix[i][j]);
                }
                System.out.println("");
            }
        }

        private static int[][] matrixOsszeg(int[][] matrixA, int[][] matrixB) {
            int sor = matrixA.length;
            int oszl = matrixA[0].length;
            int[][] matrix = new int[sor][oszl];

            for (int i = 0; i < sor; i++) {
                for (int j = 0; j < oszl; j++) {
                    matrix[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
            return matrix;
        }


}
