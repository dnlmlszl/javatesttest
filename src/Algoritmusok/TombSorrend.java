package Algoritmusok;

public class TombSorrend {

    /*
    a b c
    d e f
    g h i
    */

        static char[] betuk;
        static int[] sorrend = new int[9];

        public static void main(String[] args) {
            eredetiSorrend();
            feltoltes();
            megjelenites("eredeti", false);
            //keveres();
            megjelenites("kevert", true);
            megjelenites("újra eredeti", false);
        }

        private static void feltoltes() {
            betuk = new char[9];
            //betuk[0] = 'a';
            //betuk[8] = 'i';
            for (int i = 0; i < 9; i++) {
                betuk[i] = (char)(i+65);
            }
        }

        private static void megjelenites(String cim, boolean keverve) {
            if(keverve){
                kevertSorrend();
            }else{
                eredetiSorrend();
            }
            System.out.println(cim);
            for (int i = 0; i < betuk.length; i++) {
                if(i != 0 && i % 3 == 0){
                    System.out.println("");
                }
                System.out.print(betuk[sorrend[i]] + " ");
            }
            System.out.println("");
        }

        private static void kevertSorrend() {
            sorrend[0] = 3;
            sorrend[1] = 6;
            sorrend[2] = 2;
            sorrend[3] = 5;
            sorrend[4] = 1;
            sorrend[5] = 0;
            sorrend[6] = 7;
            sorrend[7] = 5;
            sorrend[8] = 4;
        }

        private static void eredetiSorrend() {
            for (int i = 0; i < 9; i++) {
                sorrend[i] = i;
            }
        }

    }

