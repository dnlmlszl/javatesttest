package Algoritmusok;

import java.util.Scanner;

public class Dice {
    /* dobunk 2 kockával, jelenítsük meg a statisztikát,
    hogy melyik kockával mennyit dobtunk:
    */
//    dobások száma: 90
//       1   2 .. 6
//    ------------
//    1 |20  15
//    2 |    22   13
//    ..|
//    6 |7   35   27
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int oldal = 6;
        int[][] dobasok = new int[oldal+1][oldal+1];//0..5
        int dobasokSzama = bekeres();
        statisztika(dobasok, dobasokSzama);
        megjelenites(dobasok);
    }

    private static int bekeres() {
        //Scanner bekérés
        System.out.println("Dobások száma:");
        return Integer.parseInt(scanner.nextLine());
    }

    private static void statisztika(int[][] tomb, int db) {
        for (int i = 0; i < db; i++) {
            int dobas1 = (int) (Math.random() * 6 + 1);//1..6
            int dobas2 = (int) (Math.random() * 6 + 1);//1..6
            tomb[dobas1][dobas2]++;
        }
    }

    private static void megjelenites(int[][] dobasok) {
//        for (int[] tomb : dobasok) {
//            for (int dobas : tomb) {
//                if(dobas != 0){
//                    System.out.printf("%d",dobas);
//                }
//            }
//            System.out.println("");
//        }

        /* fejléc sor: */
        System.out.print("  ");//1|van alatta, ezért 2 szközzel bentebb kezdünk
        for (int i = 1; i <= 6; i++) {
            System.out.printf("%5d",i);
        }
        System.out.println("\n--------------------------------");
        for (int i = 1; i < dobasok.length; i++) {
            for (int j = 0; j < dobasok[0].length; j++) {
                if (j == 0) {
                    System.out.print(i + "|");
                } else {
                    System.out.printf("%5d", dobasok[i][j]);
                }
            }

            System.out.println("");
    }

    int[] max = maxdobas(dobasok);
    //int e = dobasok[max[0]][max[1]];
    int k1 = max[0];
    int k2 = max[1];
    int e = dobasok[k1][k2];
            System.out.printf("A legtöbbször dobott érték: %d (%d,%d)\n",e, k1, k2);
        }

    private static int[] maxdobas(int[][] tomb) {
        /* összegzés tétele: */
        int im = 1;
        int jm = 1;
        for (int i = 0; i < tomb.length; i++) {
            for (int j = 0; j < tomb[0].length; j++) {
                if(tomb[i][j] > tomb[im][jm]){
                    im = i;
                    jm = j;
                }
            }
        }
        return new int[]{im, jm};
    }
}